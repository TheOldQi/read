package com.xiafei.read.springboot.part3.s6core.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
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
@SpringBootApplication
@EnableConfigurationProperties(value = RsaProperties.class)
@RestController
public class Application {

    @Resource
    private RsaProperties rsaProperties;

    @RequestMapping("/prop")
    public String pro() {
        return rsaProperties.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
