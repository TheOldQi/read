package com.xiafei.read.springboot.part1.s2common.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class Main {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.register(ProfileConfig.class);
//        context.refresh();
//        final DemoBean beanDev = context.getBean(DemoBean.class);
//        System.out.println("DemoBean now content:" + beanDev.getContent());
        context.getEnvironment().setActiveProfiles("pro");
        context.register(ProfileConfig.class);
        context.refresh();
        final DemoBean beanPro = context.getBean(DemoBean.class);
        System.out.println("DemoBean now content:" + beanPro.getContent());
        context.close();

    }
}
