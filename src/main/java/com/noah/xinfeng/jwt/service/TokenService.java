package com.noah.xinfeng.jwt.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.noah.xinfeng.jwt.User;
import org.springframework.stereotype.Service;

/**
 * @Description 生成token
 * @Author Dwf
 * @Date 2020/11/25 17:01
 * @Version 1.0
 **/
@Service
public class TokenService implements ITokenService {

    @Override
    public String getToken(User user) {
        String token = "";
        token = JWT.create().withAudience(user.getId())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
