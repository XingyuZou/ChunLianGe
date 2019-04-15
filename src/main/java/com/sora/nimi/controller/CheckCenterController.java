package com.sora.nimi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api("客服接口")
@Controller
@RequestMapping("/checkcenter")
public class CheckCenterController {
    @ApiOperation(value="获取客服", notes="根据cid获取客服")
    @ResponseBody
    @GetMapping("/getCenter")
    public String getCenter(String cid) {
        return "2233";
    }

}