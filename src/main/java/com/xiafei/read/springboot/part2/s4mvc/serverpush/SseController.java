package com.xiafei.read.springboot.part2.s4mvc.serverpush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * <P>Description: 服务器端推送技术 - 基于SSE（Server Send Event服务端发送事件）. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/7</P>
 * <P>UPDATE DATE: 2018/5/7</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
@Controller
public class SseController {


    @RequestMapping(value = "/push", produces = "text/event-stream;charset=utf-8")
    @ResponseBody
    public String push() {
        Random r = new Random();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }
}
