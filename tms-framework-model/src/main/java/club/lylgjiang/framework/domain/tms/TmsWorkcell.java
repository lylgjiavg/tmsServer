package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname TmsWorkcell
 * @Description 部门
 * @Date 2020/2/10 0:59
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="workcell")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsWorkcell implements Serializable {

    // 部门id
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;

    // 部门名称
    private String name;

    // 部门描述
    private String description;

}
