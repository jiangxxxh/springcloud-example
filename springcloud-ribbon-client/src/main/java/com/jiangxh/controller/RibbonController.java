package com.jiangxh.controller;

import com.jiangxh.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/getHello")
    public String getHello(@RequestParam String name){
        return ribbonService.getHello(name);
    }

}
