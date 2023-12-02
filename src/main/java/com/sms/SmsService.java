package com.sms;

import com.sms.optimize.Strategy.AStrategy;

/**
 * @author Josh
 * @date 2023/11/16 10:06
 */
public class SmsService {

    /**
     *
     *
     * @author Josh
     * @date 19:46 2023/11/20
     * @param serviceType a、b、c服务商
     * @param sendType one：一条，more：多条
     **/
    public void send(String serviceType, String sendType) {
        if (serviceType.equals("a")) {
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
        } else if (serviceType.equals("b")) {
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

    public static void main(String[] args) {
        AStrategy aStrategy = new AStrategy();
        aStrategy.send("");
    }
}
