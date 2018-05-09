/**
 * <P>Description: bean的scope注解.
 * （1）Singleton：一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例。
 * <p>
 * （2）Prototype：每次调用新建一个Bean的实例。
 * <p>
 * （3）Request：Request：Web项目中，给每一个http request新建一个Bean实例。
 * <p>
 * （4）Session：Web项目中，给每一个http session新建一个Bean实例。
 * <p>
 * （5）GlobalSession：这个只在portal应用中有用，给每一个global http session新建一个Bean实例。</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/23</P>
 * <P>UPDATE DATE: 2018/4/23</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
package com.xiafei.read.springboot.part1.s2common.scope;