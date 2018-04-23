package com.xiafei.read.springboot.part1.section2common.spelandresource;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Configuration
@ComponentScan("com.xiafei.read.springboot.part1.section2common.spelandresource")
@PropertySource("classpath:com/xiafei/read/springboot/part1/section2common/spelandresource/test.properties")
public class SpelResourceConfig {

    /**
     * 注入普通字符.
     */
    @Value("I love You!")
    private String normal;

    /**
     * 拿到系统属性.
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 表达式计算后的值.
     */
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNo;

    /**
     * 注入其他bean属性.
     */
    @Value("#{demoService.another}")
    private String fromAnother;


    /**
     * 注入文件.
     */
    @Value("classpath:com/xiafei/read/springboot/part1/section2common/spelandresource/test.txt")
    private Resource file;

    /**
     * 注入网络资源.
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 注入配置文件资源.
     */
    @Value("${book.name}")
    private String bookName;

    /**
     * 对应profile，可以不同环境不同配置文件 .
     */
    @Autowired
    private Environment environment;

    /**
     * 注入配置文件资源.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println("normal:" + normal);
            System.out.println("osName:" + osName);
            System.out.println("randomNo:" + randomNo);
            System.out.println("fromAnother:" + fromAnother);
            System.out.println("file:" + IOUtils.toString(file.getInputStream(), "utf-8"));
            System.out.println("url:" + IOUtils.toString(testUrl.getInputStream(), "utf-8"));
            System.out.println("bookName:" + bookName);
            System.out.println("env:" + environment.getProperty("book.author"));
        } catch (Exception e) {

        }
    }
}
