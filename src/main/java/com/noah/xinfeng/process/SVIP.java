package com.noah.xinfeng.process;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 16:00
 * @Version 1.0
 **/
public class SVIP implements UserClass {

    @Override
    public String send(Integer money) {
        return "SVIP";
    }

    @Override
    public Integer getType() {
        return 2;
    }

}
