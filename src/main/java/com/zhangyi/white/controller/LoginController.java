package com.zhangyi.white.controller;

import com.zhangyi.white.Result.Result;
import com.zhangyi.white.entity.User;
import com.zhangyi.white.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login" )
    @ResponseBody
    public Result login(@RequestBody User requestuser){
        String username = requestuser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username,requestuser.getPassword());
        if (user == null){
            return new Result(400);
        }else{
            return new Result(200);
        }


    }



}
