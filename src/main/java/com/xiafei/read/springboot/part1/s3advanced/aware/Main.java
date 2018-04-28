package com.xiafei.read.springboot.part1.s3advanced.aware;

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
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        final AwareService bean = context.getBean(AwareService.class);
        bean.outPutResult();
        context.close();
    }
}
