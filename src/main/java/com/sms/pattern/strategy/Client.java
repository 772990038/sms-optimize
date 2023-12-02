package com.sms.pattern.strategy;

/**
 * @author Josh
 * @date 2023/11/8 14:09
 */
public class Client {

    public static void main(String[] args) {
        CalculatorContext calculatorContext = new CalculatorContext(new Add());
        Integer calculate = calculatorContext.calculate(5, 10);
        System.out.println(calculate);


    }
}
