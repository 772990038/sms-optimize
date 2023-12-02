package com.sms.pattern.strategy;

/**
 * @author Josh
 * @date 2023/11/8 13:59
 */
public class CalculatorContext {

    private final CalculateStrategy calculateStrategy;

    public CalculatorContext(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public Integer calculate(Integer num1, Integer num2) {
        return calculateStrategy.calculate(num1, num2);
    }
}
