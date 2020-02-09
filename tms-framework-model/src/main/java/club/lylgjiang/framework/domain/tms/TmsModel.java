package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Classname TmsModel
 * @Description 夹具模组
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="model")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsModel {

  // 夹具模组id
  @Id
  @GeneratedValue(generator = "jpa-assigned")
  @Column(length = 32)
  private String id;

  // 夹具模组名称
  private String name;

  // 夹具模组描述
  private String description;

}
