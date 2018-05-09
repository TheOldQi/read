package com.xiafei.read.springboot.part2.s4mvc.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/7</P>
 * <P>UPDATE DATE: 2018/5/7</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@RestController
public class MyRestController {

    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=utf-8")
    public String testRest() {

        return demoService.saySomething();
    }
}
