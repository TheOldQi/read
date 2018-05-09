/**
 * <P>Description: 条件注解.
 * 通过活动的profile，我们可以获得不同的Bean。Spring 4提供了一个更通用的基于条件的Bean的创建，即使用
 *
 * @Conditional 注解。
 * @Conditional 根据满足某一个特定条件创建一个特定的Bean。比方说，当某一个jar包在一个类路径下的时候，
 * 自动配置一个或多个Bean；或者只有某个Bean被创建才会创建另外一个Bean。
 * 总的来说，就是根据特定条件来控制Bean的创建行为，这样我们可以利用这个特性进行一些自动的配置。</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
package com.xiafei.read.springboot.part1.s3advanced.conditional;