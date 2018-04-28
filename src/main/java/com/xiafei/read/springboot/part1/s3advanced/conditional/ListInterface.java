package com.xiafei.read.springboot.part1.s3advanced.conditional;

/**
 * <P>Description: 列出目录下的文件的命令接口. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public interface ListInterface {

    /**
     * 返回在相应系统中显示目录下文件列表的命令.
     *
     * @return 在相应系统中显示目录下文件列表的命令
     */
    String showListCmd();
}
