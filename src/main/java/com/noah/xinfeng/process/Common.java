package com.noah.xinfeng.process;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 15:59
 * @Version 1.0
 **/
public class Common implements UserClass{
    @Override
    public String send(Integer money) {

        return "普通用户";
    }

    @Override
    public Integer getType() {
        return 0;
    }
}
