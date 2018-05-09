package com.xiafei.read.springboot.part2.s4mvc.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * <P>Description: Controller统一异常处理handler. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/7</P>
 * <P>UPDATE DATE: 2018/5/7</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@ControllerAdvice
public class ExceptionHandlerAdvisor {


    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest webRequest) {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("errorMsg", e.getMessage());
        return mav;
    }

    @ModelAttribute
    public void addAttr(Model model) {
        model.addAttribute("msg", "额外信息");

    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }
}
