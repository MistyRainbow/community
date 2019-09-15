package wjf.mistyr.com.domain;

import javax.persistence.*;

/**
 * @Author wjf
 * @date 2019/9/15 10:58
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //主键自动生成
    private Integer id;
    @Column    //定制生成字段的属性，后面可以追加(name="字段名")，若没有配置，则默认是属性值username
    private String username;//用户名
    @Column
    private String email;//邮箱
    @Column
    private String password;//密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
