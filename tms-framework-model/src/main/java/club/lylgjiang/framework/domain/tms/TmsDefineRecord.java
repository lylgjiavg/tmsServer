package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Classname TmsDefineRecord
 * @Description 夹具定义添加记录
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="define_record")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsDefineRecord {

  // 夹具定义id
  @Column(name="define_id")
  private String defineId;

  // 夹具录入人id
  @Column(name="user_id")
  private String userId;

  // 夹具定义录入日期
  private String datetime;

  // 夹具添加内容(json数据)
  private String detail;

}
