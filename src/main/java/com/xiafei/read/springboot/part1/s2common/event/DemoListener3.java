package com.xiafei.read.springboot.part1.s2common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <P>Description: 事件监听器. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Component
public class DemoListener3 implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(final DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我[listener3]接收到了[publisher]发布的消息：" + msg);
    }
}
