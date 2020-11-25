package com.noah.xinfeng.jwt.service;

import com.noah.xinfeng.jwt.User;

/**
 * @author duweifeng
 */
public interface ITokenService {

    /**
     * 获取token
     *
     * @param user
     * @return
     */
    String getToken(User user);
}
