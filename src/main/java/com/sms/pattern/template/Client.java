package com.sms.pattern.template;

/**
 * @author Josh
 * @date 2023/11/8 19:46
 */
public class Client {

    public static void main(String[] args) {
        AMsgService aMsgService = new AMsgService();
        Object o = aMsgService.sendMsg(new Object());
    }
}
