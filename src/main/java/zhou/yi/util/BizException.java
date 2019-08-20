package zhou.yi.util;

public class BizException extends Exception {
    private static final long serialVersionUID = 1L;

    //权限
    public static final BizException ACCESS_TOKEN_ERR =
            new BizException(ExceptionType.ACCESS_TOKEN_ERR, "TOKEN无效");
    //输入错误
    public static final BizException INPUT_ERR        =
            new BizException(ExceptionType.INPUT_ERR, "输入错误");
    //没有权限
    public static final BizException PRIORITY_ERR     =
            new BizException(ExceptionType.PRIORITY_ERR, "没有权限");
    //业务
    public static final BizException BUSINESS_ERR     =
            new BizException(ExceptionType.BUSINESS_ERR, "业务");
    //内部错误
    public static final BizException INTERNAL_ERR     =
            new BizException(ExceptionType.INTERNAL_ERR, "内部错误");

    private ExceptionType exceptionType;

    public BizException(ExceptionType type, String message) {
        super(message);
        this.exceptionType = type;
    }

    public ExceptionType getExceptionType() {
        return exceptionType;
    }

    public enum ExceptionType {
        ACCESS_TOKEN_ERR,
        INPUT_ERR,
        BUSINESS_ERR,PRIORITY_ERR,INTERNAL_ERR

    }
}
