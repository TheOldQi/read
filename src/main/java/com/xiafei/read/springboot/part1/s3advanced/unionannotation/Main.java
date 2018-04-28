package com.xiafei.read.springboot.part1.s3advanced.unionannotation;

import com.xiafei.read.springboot.part1.s3advanced.unionannotation.config.UnionAnnoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/28</P>
 * <P>UPDATE DATE: 2018/4/28</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class Main {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UnionAnnoConfig.class);
        final DemoClass bean = (DemoClass) context.getBean("111");
        final ComponentScan annotation = bean.getClass().getAnnotation(ComponentScan.class);
        System.out.println("componentScan:" + annotation);
        bean.output();
        context.close();
    }
}
