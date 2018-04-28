package com.xiafei.read.springboot.part1.s3advanced.unittest;

import com.xiafei.read.springboot.part1.s3advanced.unittest.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class JunitTest {

    @Autowired
    private TestService testService;

    @Test
    public void test() {
        testService.outPut();
    }
}
