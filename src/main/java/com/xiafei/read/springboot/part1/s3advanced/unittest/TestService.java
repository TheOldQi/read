package com.xiafei.read.springboot.part1.s3advanced.unittest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

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
@Service
@Scope("prototype")
public class TestService {

    public void outPut() {
        System.out.println("嘻嘻");
    }
}
