package com.noah.xinfeng.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 16:07
 * @Version 1.0
 **/
public class ProcessFactory {

    private static Map<Integer, UserClass> map = new HashMap<>();

    public ProcessFactory() {
        List<UserClass> process = new ArrayList<>();
        process.add(new Common());
        process.add(new Vip());
        process.add(new SVIP());
        map = process.stream().collect(Collectors.toMap(UserClass::getType, userClass -> userClass));
    }

    public static class Process {
        public static ProcessFactory processFactory = new ProcessFactory();
    }

    public static ProcessFactory getInstance() {
        return Process.processFactory;
    }

    public String get(Integer type) {
        return map.get(type).send(1111);
    }

}
