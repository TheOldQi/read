package com.xiafei.read.springboot.part1.section1foundation.aop;

import org.springframework.stereotype.Service;

/**
 * <P>Description: 被注解标注拦截的例子. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解标记拦截的方法")
    public void add() {

    }
}
