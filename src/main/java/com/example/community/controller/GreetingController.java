package com.example.community.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ApiModel("用户信息")
@Controller
public class GreetingController {

    @ApiOperation("用户信息参数测试")
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }
}
