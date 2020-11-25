package com.noah.xinfeng.jwt.service;

import com.noah.xinfeng.jwt.User;
import com.noah.xinfeng.jwt.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 17:14
 * @Version 1.0
 **/
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User findByUsername(User user) {
        return userMapper.findByUsername(user);
    }
}
