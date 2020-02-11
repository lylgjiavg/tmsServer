package club.lylgjiang.framework.model.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname QueryResult
 * @Description 查询结果
 * @Date 2020/2/11 14:02
 * @Created by 姜立成
 */
@Data
@ToString
public class QueryResult<T> {

    // 数据列表
    private List<T> list;
    // 数据总数
    private long total;

}
