package com.sms.optimize.Strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Josh
 * @date 2023/11/20 20:03
 */
public class StrategyFactory {

    /**
     * 有状态
     *
     * @author Josh
     * @date 20:06 2023/11/20
     * @param type
     * @return com.sms.optimize.Strategy.Strategy
     **/
//    public static Strategy getStrategy(String type) {
//        if (type.equals("A")) {
//            return new AStrategy();
//        } else if (type.equals("B")) {
//            return new BStrategy();
//        } else {
//            return null;
//        }
//    }

    private final static Map<String, Strategy> map = new ConcurrentHashMap<>();

    {
        map.put("A", new AStrategy());
        map.put("B", new BStrategy());
    }

    /**
     * 无状态
     *
     * @author Josh
     * @date 20:07 2023/11/20
     * @param type
     * @return com.sms.optimize.Strategy.Strategy
     **/
    public static Strategy getStrategy(String type) {
        return map.get(type);
    }
}
