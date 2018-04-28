package com.xiafei.read.springboot.part1.s3advanced.conditional;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class LinuxListService implements ListInterface {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
