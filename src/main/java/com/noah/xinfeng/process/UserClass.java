package com.noah.xinfeng.process;

/**
 * 用户类型
 */
public interface UserClass {

    /**
     * 发送什么消息
     * @return
     */
    String send(Integer money);

    Integer getType();
}
