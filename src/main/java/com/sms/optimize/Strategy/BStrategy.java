package com.sms.optimize.Strategy;

/**
 * @author Josh
 * @date 2023/11/20 19:50
 */
public class BStrategy implements Strategy {

    @Override
    public void send(String sendType) {
        // 校验参数
        // 请求第三方接口
        if (sendType.equals("one")) {

        } else if (sendType.equals("more")) {

        }
        // 记录流水
        boolean result = true;
        if (result) {
            // 成功处理
        } else {
            // 失败处理
        }
    }
}
