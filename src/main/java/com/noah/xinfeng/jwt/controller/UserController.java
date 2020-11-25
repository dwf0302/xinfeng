package com.noah.xinfeng.jwt.controller;

import com.alibaba.fastjson.JSONObject;
import com.noah.xinfeng.jwt.User;
import com.noah.xinfeng.jwt.UserLoginToken;
import com.noah.xinfeng.jwt.service.IUserService;
import com.noah.xinfeng.jwt.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 17:13
 * @Version 1.0
 **/
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private TokenService tokenService;

    @GetMapping("user")
    public User login(Long id) {
        User user = userService.findUserById(id);
        return user;
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Object login(@RequestBody User user) {
        JSONObject jsonObject = new JSONObject();
        User loginUser = userService.findByUsername(user);
        if (loginUser == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            return jsonObject;
        } else {
            if (!loginUser.getPassword().equals(user.getPassword())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject;
            } else {
                String token = tokenService.getToken(loginUser);
                jsonObject.put("token", token);
                jsonObject.put("user", loginUser);
                return jsonObject;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }
}

