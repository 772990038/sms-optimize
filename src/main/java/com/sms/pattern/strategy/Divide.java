package com.sms.pattern.strategy;

/**
 * @author Josh
 * @date 2023/11/8 13:55
 */
public class Divide implements CalculateStrategy {
    @Override
    public Integer calculate(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
