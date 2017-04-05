package com.wetts.base.api;

public enum ErrorCode {

    // 成功返回
    SYSTEM_SUCCESS(10000, "请求处理成功"),

    SYSTEM_ERROR(10001, "系统错误，请稍后再试！"),

    ALREADY_SUBSCRIBED(90000, "已经订阅！"),
    INVALID_USER(90001, "无效用户！"),
    INVALID_JPH(90002, "无效九派号！"),
    LACK_OF_PARAM(90003, "缺少必要的请求参数！"),
    HAVE_NOT_SUBSCRIBED(90004, "尚未订阅！"),
    NOT_EXIST_CONTENT(90005, "不存在的内容！"),
    ALREADY_COLLECTED(90006, "已经收藏！"),
    HAVE_NOT_COLLECTED(90007, "尚未收藏！"),
    ALREADY_ATTITUDED(90008, "已经点过赞啦！"),
    HAVE_NOT_ATTITUDED(90009, "尚未点赞！"),
    ALREADY_RECOMMENDED(90010, "已经推荐！"),
    HAVE_NOT_RECOMMENDED(90011, "尚未推荐！"),
    INVALID_CONTENT_ID(90012, "无效内容id！"),
    INVALID_PAY_TYPE(90013, "不支持的支付方式！"),
    AMOUNT_FORMAT_ERROR(90014, "金额格式错误！"),
    MOBILE_FORMAT_ERROR(90015, "手机号码格式错误"),
    MOBILE_HAVE_USED(90016, "手机号码已被注册"),
    SEND_SMS_FAILED(90017, "发送短信失败,请重试！"),
    PASSWORD_FORMAT_ERROR(90018, "密码格式错误，应由6-15位数字或字母组成！"),
    PASSWORD_INCONSISTENCY(90019, "两次输入的密码不一致！"),
    INVALID_VALI_CODE(90020, "验证码已失效，请重新发送验证码！"),
    VALI_CODE_ERROR(90021, "验证码错误，请确认！"),
    MISS_MATCH_PASSWORD(90022, "登录密码错误请重试！"),
    NEED_VALIDATE_CODE(90023, "需要输入验证码"),
    PASSWORD_ERROR_TIMES_OUT(90024, "连续输错密码超过5次,请与10分钟后重试！"),
    NOT_LOGIN(90025, "请先登录"),
    NOT_PERMIT(90026, "无权限查看该杂志，请办理会员！"),
    NOT_MEMBER(90027, "暂无会员信息！"),
    DEVICE_EXCEEDS_LIMIT(90028, "登录设备超出限制数"),

    ACCOUNT_FORMAT_ERROR(90100, "账号格式错误"),
    ACCOUNT_HAVE_USED(90101, "账号已被注册"),
    SEND_EMAIL_FAILED(90110, "发送邮件失败,请重试！");

    //错误码
    private Integer code;
    //系统提示信息
    private String msg;

    public Integer getCode() {
        return code;
    }

    public final void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }


    private ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public static ErrorCode getErrorCode(Integer errcode) {
        for (ErrorCode item : values()) {
            if (item.getCode().intValue() == errcode) {
                return item;
            }
        }
        return null;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    public String toString() {
        return this.code + "(" + this.msg + ")";
    }
}
