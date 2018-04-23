package com.xiafei.read.springboot.part1.section1foundation.aop;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        final DemoAnnotationService bean = context.getBean(DemoAnnotationService.class);
        final DemoMethodService bean1 = context.getBean(DemoMethodService.class);
        bean.add();
        bean1.add();
        context.close();
    }
}
