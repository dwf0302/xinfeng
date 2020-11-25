package com.noah.xinfeng.process;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 16:01
 * @Version 1.0
 **/
public class TestUserClass {

    public static void main(String[] args) {
        Integer type = 0;
        String s = ProcessFactory.getInstance().get(type);
        System.out.println(s);
    }
}
