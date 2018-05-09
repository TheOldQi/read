package com.xiafei.read.springboot.part2.s4mvc;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * <P>Description: . </P>
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
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") final MultipartFile file) {

        try {
            FileUtils.copyToFile(file.getInputStream(), new File("D:\\self-study\\read\\src\\main\\resources\\" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "OK";
    }
}
