package com.xiafei.read.springboot.part2.s4mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <P>Description: spring拦截器，可以实现HanlderInterceptor接口或者继承HandlerInterceptorAdapter. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/3</P>
 * <P>UPDATE DATE: 2018/5/3</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

    /**
     * mvc控制器被调用之前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    /**
     * 成功执行之后，若发生异常不进入这里.
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final ModelAndView modelAndView) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long handleTime = endTime - startTime;
        System.out.println("本次请求的处理时间为" + handleTime + "ms");
        request.setAttribute("hanldeTime", handleTime);
    }

    @Override
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final Exception ex) throws Exception {

    }
}
