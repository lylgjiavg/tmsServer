package club.lylgjiang.framework.exception;

import club.lylgjiang.framework.model.response.ResultCode;

/**
 * @Classname CustomExceptionCast
 * @Description 自定义异常抛出类
 * @Date 2020/2/11 14:12
 * @Created by 姜立成
 */
public class CustomExceptionCast {

    /**
     * 静态方法: 抛出指定错误代码的自定义异常
     * @param resultCode 错误代码
     */
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }

}
