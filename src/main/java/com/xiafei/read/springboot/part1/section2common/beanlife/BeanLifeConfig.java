package com.xiafei.read.springboot.part1.section2common.beanlife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class BeanLifeConfig {


    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public Jsr250WayService jsr250WayService() {
        return new Jsr250WayService();
    }
}
