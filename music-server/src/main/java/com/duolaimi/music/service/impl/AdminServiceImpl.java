package com.duolaimi.music.service.impl;

import com.duolaimi.music.dao.AdminMapper;
import com.duolaimi.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean verifyPassword(String username, String password) {

        return adminMapper.verifyPassword(username, password) > 0 ? true : false;
    }
}
