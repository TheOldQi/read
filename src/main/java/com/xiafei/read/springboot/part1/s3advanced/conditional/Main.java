package com.xiafei.read.springboot.part1.s3advanced.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class Main {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        final ListInterface bean = context.getBean(ListInterface.class);
        System.out.println("在" + context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + bean.showListCmd());
    }
}
