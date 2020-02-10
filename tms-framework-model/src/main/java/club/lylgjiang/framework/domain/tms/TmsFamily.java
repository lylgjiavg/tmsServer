package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname TmsFamily
 * @Description 夹具 所属大类
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="family")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsFamily implements Serializable {

  private static final long serialVersionUID = 1305926450949886830L;

  // 夹具大类id
  @Id
  @GeneratedValue(generator = "jpa-assigned")
  @Column(length = 32)
  private String id;

  // 夹具大类名称
  private String name;

  // 夹具大类描述
  private String description;

}
