package com.xiafei.read.springboot.part1.s3advanced.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * <P>Description: 判断当前系统为windows. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata annotatedTypeMetadata) {
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
