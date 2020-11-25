package com.noah.xinfeng.jwt.service;

import com.noah.xinfeng.jwt.User;

/**
 * @author duweifeng
 */
public interface IUserService {

    /**
     * 通过用户Id获取用户
     *
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 通过名字获取token
     * @param user
     * @return
     */
    User findByUsername(User user);
}
