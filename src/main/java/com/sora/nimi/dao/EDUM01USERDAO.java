package com.sora.nimi.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface EDUM01USERDAO {
    int insert(String account,String password);
}