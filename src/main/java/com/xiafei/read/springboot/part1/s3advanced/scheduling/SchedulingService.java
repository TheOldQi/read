package com.xiafei.read.springboot.part1.s3advanced.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * <P>Description: 计划任务执行服务. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/4/26</P>
 * <P>UPDATE DATE: 2018/4/26</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Service
public class SchedulingService {

    @Scheduled(fixedDelay = 5000)
    public void fixedDelay() {
        System.out.println("固定延时任务");
    }

    @Scheduled(cron = " * 9 10 * * ?")
    public void cron() {
        System.out.println("10点零9分每秒都执行");
    }
}
