package com.xiafei.read.springboot.part1.s2common.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * <P>Description: 被监听的事件. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Data
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(final Object source, final String msg) {
        super(source);
        this.msg = msg;
    }

}
