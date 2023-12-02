package com.sms.optimize.template;

/**
 * @author Josh
 * @date 2023/11/20 19:50
 */
public class BStrategy extends StrategyTemplate {

    @Override
    protected Boolean verifyParam() {
        System.out.println("verifyParam");
        return true;
    }

    @Override
    protected Object requestApi() {
        System.out.println("requestApi");
        return new Object();
    }

    @Override
    protected Object buildResult() {
        System.out.println("buildResult");
        return new Object();
    }
}
