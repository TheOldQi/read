package com.xiafei.read.springboot.part1.section1foundation.dependinject;

import org.springframework.stereotype.Service;

/**
 * <P>Description: 执行功能的类. </P>
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
public class FunctionService {

    public void sayHello(final String name) {
        System.out.println("您好，" + name);
    }
}
