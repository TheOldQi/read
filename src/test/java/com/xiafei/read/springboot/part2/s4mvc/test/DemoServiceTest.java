package com.xiafei.read.springboot.part2.s4mvc.test;

import com.xiafei.read.springboot.part2.s4mvc.config.MyMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyMvcConfig.class)
@WebAppConfiguration("src/main/resources")
public class DemoServiceTest {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockHttpSession session;

    @Autowired
    private MockHttpServletRequest request;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/normal"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/classes/views/page.jsp"))
                .andExpect(MockMvcResultMatchers.model().attribute("msg", demoService.saySomething()));
    }

    @Test
    public void testRestController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/testRest"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().string(demoService.saySomething()));
    }
}