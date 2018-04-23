package com.xiafei.read.springboot.part1.section2common.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
public class Main {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        final DemoSingletonServcie singleton = context.getBean(DemoSingletonServcie.class);
        final DemoSingletonServcie singleton1 = context.getBean(DemoSingletonServcie.class);
        final DemoPrototypeServicer prototype = context.getBean(DemoPrototypeServicer.class);
        final DemoPrototypeServicer prototype1 = context.getBean(DemoPrototypeServicer.class);
        System.out.println("s1 与 s2 是否相等：" + (singleton == singleton1));
        System.out.println("p1 与 p2 是否相等：" + (prototype == prototype1));
        context.close();
    }
}
