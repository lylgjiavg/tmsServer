package club.lylgjiang.framework.domain.tms.ext;

import club.lylgjiang.framework.domain.tms.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @Classname TmsFixtureDefineNode
 * @Description 夹具定义 完整
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
public class TmsFixtureDefineNode extends TmsFixtureDefine {

    // 夹具所属大类
    private TmsFamily family;

    // 夹具料号
    private List<TmsPart> parts;

    // 夹具模组
    private List<TmsModel> models;

    // 夹具添加信息
    private TmsDefineRecord defineRecord;

    // 夹具修改信息
    private List<TmsDefineEdit> defineEdits;

}
