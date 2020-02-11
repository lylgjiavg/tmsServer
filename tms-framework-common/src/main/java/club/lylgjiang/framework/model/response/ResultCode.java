package club.lylgjiang.framework.model.response;

/**
 * @Classname ResultCode
 * @Description 请求结果代码
 * @Date 2020/2/11 13:52
 * @Created by 姜立成
 */
public interface ResultCode {

    // 操作是否成功,true为成功，false操作失败
    boolean success();
    // 操作代码
    int code();
    // 提示信息
    String message();

}
