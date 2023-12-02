package com.sms.pattern.factory;

/**
 * @author Josh
 * @date 2023/11/20 20:00
 */
public class Client {

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("A");
        product.buy();
    }
}
