/**
 * <P>Description: 多线程.
 * Spring通过任务执行器（TaskExecutor）来实现多线程和并发编程。
 * 使用ThreadPoolTaskExecutor可实现一个基于线程池的TaskExecutor。
 * 而实际开发中任务一般是非阻碍的，即异步的，所以我们要在配置类中通过
 *
 * @EnableAsync 开启对异步任务的支持，并通过在实际执行的Bean的方法中使用
 * @Async 注解来声明其是一个异步任务。</P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/25</P>
 * <P>UPDATE DATE: 2018/4/25</P>
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
package com.xiafei.read.springboot.part1.s3advanced.multithreads;