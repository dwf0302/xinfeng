package com.noah.xinfeng.jwt.mapper;

import com.noah.xinfeng.jwt.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 17:16
 * @Version 1.0
 **/
public interface UserMapper {

    User findUserById(@Param("id") Long id);


    User findByUsername(@Param("user") User user);
}
