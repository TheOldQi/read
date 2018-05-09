package com.xiafei.read.springboot.part2.s4mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
public class DemoAdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new RuntimeException("非常抱歉，参数有误/" + "来自@ModelAttribute:" + msg);
    }
}
