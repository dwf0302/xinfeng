package com.noah.xinfeng.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 16:58
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String Id;
    String username;
    String password;
}