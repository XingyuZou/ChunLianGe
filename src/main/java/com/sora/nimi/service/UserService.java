package com.sora.nimi.service;

import com.sora.nimi.dao.EDUM01USERDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private EDUM01USERDAO edum01USERDAO;
    public void insert(String account,String password){
        edum01USERDAO.insert(account,password);
    }
}
