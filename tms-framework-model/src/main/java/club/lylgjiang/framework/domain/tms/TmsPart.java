package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname TmsPart
 * @Description 夹具料号
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="part")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsPart implements Serializable {

  private static final long serialVersionUID = -295910482201222007L;

  // 夹具料号id
  @Id
  @GeneratedValue(generator = "jpa-assigned")
  @Column(length = 32)
  private String id;

  // 夹具料号名称
  private String name;

  // 夹具料号描述
  private String description;

}
