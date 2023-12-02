package com.sms.optimize.template;

/**
 * @author Josh
 * @date 2023/11/20 20:27
 */
public abstract class StrategyTemplate implements Strategy {

    abstract Boolean verifyParam();

    abstract Object requestApi();

    Boolean saveRecord() {
        System.out.println("saveRecord");
        return true;
    };

    abstract Object buildResult();

    public void send(String sendType) {
        // 校验参数
        verifyParam();
        // 请求第三方接口
        if (sendType.equals("one")) {
            requestApi();
        } else if (sendType.equals("more")) {
            requestApi();
        }
        // 记录流水
        boolean result = saveRecord();
        if (result) {
            // 成功处理
            buildResult();
        } else {
            // 失败处理
            buildResult();
        }
    }
}
