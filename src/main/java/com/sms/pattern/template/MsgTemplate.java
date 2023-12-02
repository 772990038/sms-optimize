package com.sms.pattern.template;

/**
 * @author Josh
 * @date 2023/11/8 19:25
 */
public abstract class MsgTemplate {

    protected abstract Boolean verifyParam(Object o);

    protected abstract Object requestApi(Object o);

    protected abstract Boolean saveRecord(Object o);

    protected abstract Object buildResult(Object o);

    public final Object sendMsg(Object o) {
        if (verifyParam(o)) {
            Object result = requestApi(o);
            if (saveRecord(result)) {
                return buildResult(result);
            }
        }
        return null;
    }
}
