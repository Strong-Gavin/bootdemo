package com.gavin.bootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gavin
 * @date 2018/9/27
 * @description 测试Controller
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/index")
    public String index(){
        logger.info("请求了此URL");
        String str = "hello world";
        return str;
    }
}
