package com.xiafei.read.springboot.part1.s2common.profile;

import lombok.Data;

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
@Data
public class DemoBean {

    private String content;

    public DemoBean(final String content){
        super();
        this.content = content;
    }
}

