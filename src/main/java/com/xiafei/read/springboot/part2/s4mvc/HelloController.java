package com.xiafei.read.springboot.part2.s4mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Slf4j
//@Controller
public class HelloController {


    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
