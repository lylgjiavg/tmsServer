package club.lylgjiang.framework.exception;


import club.lylgjiang.framework.model.response.ResultCode;

/**
 * @Classname CustomException
 * @Description 自定义异常
 * @Date 2020/2/11 14:12
 * @Created by 姜立成
 */
public class CustomException extends RuntimeException {

    private ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        super("错误代码："+resultCode.code()+"\n错误信息："+resultCode.message());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
