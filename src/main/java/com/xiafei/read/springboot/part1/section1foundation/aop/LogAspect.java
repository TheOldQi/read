package com.xiafei.read.springboot.part1.section1foundation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut(" @annotation(com.xiafei.read.springboot.part1.section1foundation.aop.Action)")
    public void annoPc() {
    }

    @After("annoPc()")
    public void afterAnno(JoinPoint joinPoint) {
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        final Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截方法" + method.getName() + ",actionName=" + action.name());
    }

    @Before(" execution (* com.xiafei.read.springboot.book.part1.section1foundation.aop.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        final Method method = signature.getMethod();
        System.out.println("直接拦截方法" + method.getName());

    }
}
