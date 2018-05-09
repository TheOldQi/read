package com.xiafei.read.springboot.part2.s4mvc.serverpush;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * <P>Description: 推送消息执行者. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/7</P>
 * <P>UPDATE DATE: 2018/5/7</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000L)
    public void refresh() {
        if (deferredResult != null) {
            deferredResult.setResult(String.valueOf(System.currentTimeMillis()));
        }
    }
}
