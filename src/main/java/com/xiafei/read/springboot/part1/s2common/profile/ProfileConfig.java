package com.xiafei.read.springboot.part1.s2common.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean demoBeanDev() {
        return new DemoBean("this is dev profile");
    }

    @Bean
    @Profile("pro")
    public DemoBean demoBeanPro() {
        return new DemoBean("this is pro profile");
    }
}
