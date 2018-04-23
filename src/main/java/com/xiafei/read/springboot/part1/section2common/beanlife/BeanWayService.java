package com.xiafei.read.springboot.part1.section2common.beanlife;

/**
 * <P>Description: 采用bean形势的配置体验bean的初始化和销毁. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void init() {
        System.out.println("BeanWayService - init");
    }

    public void destory() {
        System.out.println("BeanWayService - destory");
    }
}
