package com.xiafei.read.springboot.part2.s4mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/3</P>
 * <P>UPDATE DATE: 2018/5/3</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@RestController
@RequestMapping("/rest")
public class RestfulController {

    @GetMapping(value = "getJson", produces = "application/json;charset=utf-8")
    public DemoObj getJson() {
        return new DemoObj(123L, "json格式的");
    }

    // 依赖jackson-xml包
    @GetMapping(value = "getXml", produces = "application/xml;charset=utf-8")
    public DemoObj getXml() {
        return new DemoObj(456L, "xml格式的");
    }
}
