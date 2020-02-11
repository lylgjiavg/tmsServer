package club.lylgjiang.framework.model.response;

import lombok.Data;
import lombok.ToString;

/**
 * @Classname QueryResponseResult
 * @Description 查询响应结果
 * @Date 2020/2/11 14:03
 * @Created by 姜立成
 */
@Data
@ToString
public class QueryResponseResult extends ResponseResult {

    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }

}
