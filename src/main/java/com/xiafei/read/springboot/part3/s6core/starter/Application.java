package com.xiafei.read.springboot.part3.s6core.starter;

import com.xiafei.springboot.starter.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <P>Description: 测试自己写的starter的功能. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/8</P>
 * <P>UPDATE DATE: 2018/5/8</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@SpringBootApplication
@RestController
public class Application {

    @Resource
    private HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return helloService.sayHello();
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
