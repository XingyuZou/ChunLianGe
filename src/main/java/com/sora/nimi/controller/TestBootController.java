package com.sora.nimi.controller;

import com.sora.nimi.entity.User;
import com.sora.nimi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
@Api(description = "|Edum01USER|登录密码")
public class TestBootController {
    public final static Logger logger = LoggerFactory.getLogger(TestBootController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }

    @ApiOperation(value = "|DisqualificationAnalysis|不合格品状态一览")
    @PostMapping("insert")
    public void insert(String account,String password){
    userService.insert(account,password);
    }
}