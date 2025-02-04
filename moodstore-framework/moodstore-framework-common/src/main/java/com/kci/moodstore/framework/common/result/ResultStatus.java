package com.kci.moodstore.framework.common.result;

/**
 * @program: seckill-parent
 * @description: status enum
 * @author: PlusL
 * @create: 2022-07-05 15:01
 **/

public enum ResultStatus {
    /**
     * 常规错误码
     */
    SUCCESS("200", "成功"),
    FAILD("400", "失败"),
    NOT_FOUND("404", "资源未找到"),
    METHOD_NOT_ALLOWED("405", "请求方法不正确"),
    EXCEPTION("-1", "系统异常"),
    PARAM_ERROR("10000", "参数错误"),
    SYSTEM_ERROR("10001", "系统错误"),
    NET_BUSY("10010", "网络繁忙，请稍后再试"),
    FILE_NOT_EXIST("10002", "文件不存在"),
    FILE_NOT_DOWNLOAD("10003", "文件没有下载"),
    FILE_NOT_GENERATE("10004", "文件没有生成"),
    FILE_NOT_STORAGE("10005", "文件没有入库"),
    SYSTEM_DB_ERROR("10006", "数据库系统错误"),
    FILE_ALREADY_DOWNLOAD("10007", "文件已经下载"),
    DATA_ALREADY_PEXISTS("10008", "数据已经存在"),
    SERVER_ERROR("400", "服务异常"),
    REDIS_ERROR("10009", "缓存服务异常"),


    /**
     * 注册登录
     */
    RESIGETR_SUCCESS("20000", "注册成功!"),
    RESIGETER_FAIL("200001", "注册失败!"),
    CODE_FAIL("200002", "验证码不一致!"),

    /**
     * check
     */
    BIND_ERROR("30001", "参数校验异常：%s"),
    ACCESS_LIMIT_REACHED("30002", "请求非法!"),
    REQUEST_ILLEGAL("30004", "访问太频繁!"),
    SESSION_ERROR("30005", "Session不存在或者已经失效!"),
    PASSWORD_EMPTY("30006", "登录密码不能为空!"),
    MOBILE_EMPTY("30007", "手机号不能为空!"),
    MOBILE_ERROR("30008", "手机号格式错误!"),
    MOBILE_NOT_EXIST("30009", "账号不存在!"),
    PASSWORD_ERROR("30010", "密码错误!"),
    USER_NOT_EXIST("30011", "用户不存在！"),
    NICKNAME_OR_PASSWORD_ERROR("30012", "用户名或密码有误"),
    TOKEN_ERROR("30013", "token不存在或已失效，请重新登录"),

    /**
     * 消息队列
     */
    SEND_SUCCESS("70000", "排队中~"),
    SEND_FAIL("70001", "排队失败，请稍后重试~");


    private String code;
    private String message;

    ResultStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

//    private ResultStatus(Object... args) {
//        if (!ObjectUtil.isEmpty(this.message)){
//            this.message = String.format(this.message, args);
//        }
//    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return this.name();
    }

    public String getOutputName() {
        return this.name();
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
