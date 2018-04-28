package com.xiafei.read.springboot.part1.s2common.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <P>Description: 采用基于Jsr250的注解形式感受bean的初始化和销毁. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class Jsr250WayService {

    public Jsr250WayService() {
        super();
        System.out.println("初始化构造函数-Jsr250WayService");
    }

    @PostConstruct
    public void init() {
        System.out.println("Jsr250WayService - init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Jsr250WayService - destory");
    }
}
