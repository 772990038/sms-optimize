package com.sms.optimize.template;

/**
 * @author Josh
 * @date 2023/11/20 20:14
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = StrategyFactory.getStrategy("A");
        strategy.send("one");
        
    }
}
