package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Classname TmsFixtureDefine
 * @Description 夹具定义
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="fixture_define")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsFixtureDefine {

    // 夹具定义id
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;

    // 夹具定义代码
    private String code;

    // 夹具定义名称
    private String name;

    // 该夹具在每条产线上需要配备的数量
    private String url;

    // 夹具用途
    @Column(name="used_for")
    private String usedFor;

    // 夹具保养点检周期
    @Column(name="pm_period")
    private String pmPeriod;

    // 夹具责任人
    @Column(name="owner_id")
    private String ownerId;

    // 夹具所属工作部id
    @Column(name="workcell_id")
    private String workcellId;

}
