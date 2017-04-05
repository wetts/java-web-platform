package com.wetts.base.api;

/**
 * Created by wetts on 2017/4/5.
 */
public class ApiResultUtils {

    public static BaseResultVo buildSuccessResultInfo() {
        return buildSuccessResultInfo(null);
    }

    public static BaseResultVo buildSuccessResultInfo(Object resultData) {
        BaseResultVo resultVo = new BaseResultVo();
        resultVo.setResultData(resultData);
        resultVo.setResultMessage(ErrorCode.SYSTEM_SUCCESS.getMsg());
        resultVo.setResultCode(ErrorCode.SYSTEM_SUCCESS.getCode());
        return resultVo;
    }

    private static BaseResultVo buildFailedResultInfo(int resultCode, String failedMsg, Object resultData) {
        BaseResultVo resultVo = new BaseResultVo(resultCode, failedMsg);
        resultVo.setResultData(resultData);
        return resultVo;
    }

    public static BaseResultVo buildFailedResultInfo(ErrorCode errorCode) {
        return buildFailedResultInfo(errorCode.getCode(), errorCode.getMsg(), null);
    }

    public static BaseResultVo buildFailedResultInfo(ErrorCode errorCode, Object resultData) {
        return buildFailedResultInfo(errorCode.getCode(), errorCode.getMsg(), resultData);
    }
}
