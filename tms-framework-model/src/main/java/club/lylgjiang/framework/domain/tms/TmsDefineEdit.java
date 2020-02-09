package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Classname TmsDefineEdit
 * @Description 夹具定义 修改记录
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="fixture_define")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsDefineEdit {

  // 夹具定义修改id
  @Column(name="define_id")
  private String defineId;

  // 夹具修改人id
  @Column(name="user_id")
  private String userId;

  // 夹具修改日期
  private String datetime;

  // 夹具定义修改内容(json数据)
  private String detail;


}
