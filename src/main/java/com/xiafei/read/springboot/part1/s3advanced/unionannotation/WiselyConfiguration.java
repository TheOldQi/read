package com.xiafei.read.springboot.part1.s3advanced.unionannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <P>Description: 聪明的configuration. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/28</P>
 * <P>UPDATE DATE: 2018/4/28</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan
@Configuration
public @interface WiselyConfiguration {

    String[] basePackages() default {};

    String value() default "";

}
