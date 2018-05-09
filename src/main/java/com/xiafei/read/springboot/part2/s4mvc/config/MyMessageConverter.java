package com.xiafei.read.springboot.part2.s4mvc.config;

import com.xiafei.read.springboot.part2.s4mvc.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * <P>Description: springMvc消息转换处理器. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/7</P>
 * <P>UPDATE DATE: 2018/5/7</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));
    }

    @Override
    protected boolean supports(final Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    @Override
    protected DemoObj readInternal(final Class<? extends DemoObj> clazz, final HttpInputMessage inputMessage)
            throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] strArrr = temp.split("-");

        return new DemoObj(new Long(strArrr[0]), strArrr[1]);
    }

    @Override
    protected void writeInternal(final DemoObj obj, final HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {

        String out = "hello:" + obj.getId() + " - " + obj.getMsg();
        outputMessage.getBody().write(out.getBytes("UTF-8"));

    }
}
