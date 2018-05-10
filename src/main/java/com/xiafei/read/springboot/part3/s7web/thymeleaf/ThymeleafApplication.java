package com.xiafei.read.springboot.part3.s7web.thymeleaf;

import com.xiafei.read.springboot.part3.s7web.thymeleaf.vo.PersonVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/10</P>
 * <P>UPDATE DATE: 2018/5/10</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Controller
@SpringBootApplication
public class ThymeleafApplication {

    @RequestMapping("/")
    public String index(Model model) {
        PersonVo single = new PersonVo("单身狗", 50);
        List<PersonVo> people = new ArrayList<>(3);
        people.add(new PersonVo("李丽", 20));
        people.add(new PersonVo("李雷", 14));
        people.add(new PersonVo("韩梅梅", 16));
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
