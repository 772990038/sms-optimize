package com.sms.pattern.factory;

/**
 * @author Josh
 * @date 2023/11/20 19:59
 */
public class ProductFactory {

    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new AProduct();
            case "B":
                return new BProduct();
            default:
                return null;
        }
    }
}
