package com.xiafei.read.springboot.part1.s1foundation.javaconfig;

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
        final AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        final UseFunctionService bean = context.getBean(UseFunctionService.class);
        bean.sayHello("齐霞飞");
        context.close();
    }
}
