/*
 * This file is generated by jOOQ.
*/
package swust.xl.pojo.po.mysql.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPerson implements Serializable {

    private static final long serialVersionUID = 443259655;

    private Long      id;
    private String    username;
    private String    sex;
    private Byte      isSystem;
    private String    salt;
    private String    passwordSalt;
    private Timestamp registDatetime;
    private Timestamp lastLoginDatetime;

    public UserPerson() {}

    public UserPerson(UserPerson value) {
        this.id = value.id;
        this.username = value.username;
        this.sex = value.sex;
        this.isSystem = value.isSystem;
        this.salt = value.salt;
        this.passwordSalt = value.passwordSalt;
        this.registDatetime = value.registDatetime;
        this.lastLoginDatetime = value.lastLoginDatetime;
    }

    public UserPerson(
        Long      id,
        String    username,
        String    sex,
        Byte      isSystem,
        String    salt,
        String    passwordSalt,
        Timestamp registDatetime,
        Timestamp lastLoginDatetime
    ) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.isSystem = isSystem;
        this.salt = salt;
        this.passwordSalt = passwordSalt;
        this.registDatetime = registDatetime;
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getIsSystem() {
        return this.isSystem;
    }

    public void setIsSystem(Byte isSystem) {
        this.isSystem = isSystem;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPasswordSalt() {
        return this.passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public Timestamp getRegistDatetime() {
        return this.registDatetime;
    }

    public void setRegistDatetime(Timestamp registDatetime) {
        this.registDatetime = registDatetime;
    }

    public Timestamp getLastLoginDatetime() {
        return this.lastLoginDatetime;
    }

    public void setLastLoginDatetime(Timestamp lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserPerson (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(sex);
        sb.append(", ").append(isSystem);
        sb.append(", ").append(salt);
        sb.append(", ").append(passwordSalt);
        sb.append(", ").append(registDatetime);
        sb.append(", ").append(lastLoginDatetime);

        sb.append(")");
        return sb.toString();
    }
}
