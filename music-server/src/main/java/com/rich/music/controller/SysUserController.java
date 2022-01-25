package com.rich.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.rich.music.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Api(tags = "管理员模块")
@RestController
public class SysUserController {

    @Autowired
    private SysUserServiceImpl sysUserService;

//    判断是否登录成功
    @ResponseBody
    @RequestMapping(value = "/admin/login/status")
    public Object loginStatus(HttpServletRequest req, HttpSession session){
        JSONObject jsonObject = new JSONObject();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean res = sysUserService.verifyPassword(username, password);
        if (res) {
            jsonObject.put("code", 1);
            jsonObject.put("msg", "登录成功");
            session.setAttribute("username", username);
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "用户名或密码错误");
        }
        return jsonObject;

    }
}
