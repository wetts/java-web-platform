package com.wetts.base.api.exception;

import com.wetts.base.api.ErrorCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wetts on 2017/3/22.
 */
public class ApiException extends RuntimeException {

    private ErrorCode errorCode;
    private Map returnData = new HashMap();

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public void putReturnData(String key, Object value) {
        returnData.put(key, value);
    }

    public Map getReturnData() {
        return returnData;
    }
}
