package com.xiafei.read.springboot.part1.section1foundation.javaconfig;

/**
 * <P>Description: 使用执行功能服务的类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(final FunctionService functionService) {
        this.functionService = functionService;
    }

    public void sayHello(final String name) {
        functionService.sayHello(name);
    }
}
