package com.rich.music.service.impl;

import com.rich.music.dao.SysUserMapper;
import com.rich.music.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public boolean verifyPassword(String username, String password) {

        return sysUserMapper.verifyPassword(username, password) > 0;
    }
}
