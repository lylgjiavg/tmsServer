package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname TmsFixtureEntity
 * @Description 夹具实体
 * @Date 2020/2/10 1:09
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="fixture_entity")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsFixtureEntity implements Serializable {

  private static final long serialVersionUID = -1203783894307564028L;

  // 夹具实体id(同夹具序列号seq_id)
  @Id
  @GeneratedValue(generator = "jpa-assigned")
  @Column(length = 32)
  private String id;

  // 夹具定义id(同夹具代码code)
  @Column(name="define_id")
  private String defineId;

  // 采购单据号
  @Column(name="bill_no")
  private String billNo;

  // 入库日期(同reg_date)
  private String datetime;

  // 已使用次数
  @Column(name="used_count")
  private long usedCount;

  // 夹具存放库位
  private String location;


}
