package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户信息")
    @ApiImplicitParam(name = "user_id",required = true)
    @GetMapping(value = "/hello")
    public String getDemo(@RequestParam("user_id") String user_id){
        /*User user = userService.introduce(user_id);*/

        return  "hello";
    }
}
