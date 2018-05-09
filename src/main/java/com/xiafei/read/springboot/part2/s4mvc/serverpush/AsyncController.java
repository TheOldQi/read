package com.xiafei.read.springboot.part2.s4mvc.serverpush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * <P>Description: 异步控制器.
 * 页面中获取到DeferredResult实例，在调用setResult之后页面将获得返回值，然后重新获取deferredResult实例</P>
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
public class AsyncController {

//    @Resource
//    private PushService pushService;

    DeferredResult<String> deferredResult;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferred() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }

    @RequestMapping("/setResult")
    @ResponseBody
    public String setResult(String msg) {
        deferredResult.setResult(msg);
        return "[" + msg + "] set Ok!";
    }

}
