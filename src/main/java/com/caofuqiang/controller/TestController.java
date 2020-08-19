package com.caofuqiang.controller;

import com.caofuqiang.ArgsResovler.Args;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/test/argsAutoInvoke")
    public String argsAutoInvoke(@Args String token){

        System.out.println(token);
       return "1";

    }
}
