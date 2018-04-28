package com.xiafei.read.springboot.part1.s2common.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * <P>Description: spring 多例service样例. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Scope("prototype")
@Service
public class DemoPrototypeServicer {
}
