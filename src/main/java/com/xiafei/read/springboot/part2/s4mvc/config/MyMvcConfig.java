package com.xiafei.read.springboot.part2.s4mvc.config;

import com.xiafei.read.springboot.part2.s4mvc.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

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
@Configuration
@EnableWebMvc
@ComponentScan("com.xiafei.read.springboot.part2.s4mvc")
@EnableScheduling
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/classes/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    /**
     * 重写这个方法，指定静态文件对外暴露.
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.
                addResourceHandler("/js/**"). // 对外暴露路径
                addResourceLocations("classpath:/static/js/"); // 绑定的文件地址

    }

    @Bean
    public DemoInterceptor demoInterceptor() {
        return new DemoInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    /**
     * 为简单页面跳转做统一配置，否则需要一个controller方法.
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/toUpload").setViewName("upload");
        registry.addViewController("/toConverter").setViewName("converter");
        registry.addViewController("/sse").setViewName("sse");
        registry.addViewController("/toDefer").setViewName("defer");
    }


    /**
     * 设置路径匹配规则.
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);// 设置这个将不忽略url小数点后的字符
    }

    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(1 << 20);// 一次请求的文件总的最大字节
        resolver.setMaxUploadSizePerFile(1 << 10); // 每个请求文件的最大字节数
        return resolver;
    }


    @Bean
    public MyMessageConverter myMessageConverter() {
        return new MyMessageConverter();
    }

//    /**
//
//     * 重写该方法将直接覆盖springMvc默认配置的converter.
//     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//    }

    /**
     * 重写该方法可以额外增加converter.
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(myMessageConverter());
    }

}
