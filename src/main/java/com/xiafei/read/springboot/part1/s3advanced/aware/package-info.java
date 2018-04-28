/**
 * <P>Description: spring aware系列.
 * Spring的依赖注入的最大亮点就是你所有的Bean对Spring容器的存在是没有意识的。
 * 即你可以将你的容器替换成别的容器，如Google Guice，
 * 这时Bean之间的耦合度很低。但是在实际项目中，你不可避免的要用到Spring容器本身的功能资源，
 * 这时你的Bean必须要意识到Spring容器的存在，才能调用Spring所提供的资源，这就是所谓的Spring Aware。
 * 其实Spring Aware本来就是Spring设计用来框架内部使用的，若使用了Spring Aware，
 * 你的Bean将会和Spring框架耦合。</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
package com.xiafei.read.springboot.part1.s3advanced.aware;