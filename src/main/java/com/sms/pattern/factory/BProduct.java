package com.sms.pattern.factory;

/**
 * @author Josh
 * @date 2023/11/20 19:57
 */
public class BProduct implements Product {

    @Override
    public void buy() {
        System.out.println("买了b商品");
    }
}
