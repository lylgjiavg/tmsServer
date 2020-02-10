package club.lylgjiang.framework.domain.tms;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname TmsUser
 * @Description 用户
 * @Date 2020/2/10 1:04
 * @Created by 姜立成
 */
@Data
@ToString
@Entity
@Table(name="user")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TmsUser implements Serializable {

    private static final long serialVersionUID = -1161016254877995547L;

    // 用户id
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;

    // 用户姓名
    private String name;

    // 用户邮箱
    private String email;

    // 用户密码
    private String password;

}
