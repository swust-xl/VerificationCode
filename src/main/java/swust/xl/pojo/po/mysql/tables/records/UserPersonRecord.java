/*
 * This file is generated by jOOQ.
*/
package swust.xl.pojo.po.mysql.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import swust.xl.pojo.po.mysql.tables.UserPerson;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPersonRecord extends UpdatableRecordImpl<UserPersonRecord> implements Record8<Long, String, String, Byte, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1594286989;

    /**
     * Setter for <code>test.user_person.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.user_person.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>test.user_person.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.user_person.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.user_person.sex</code>.
     */
    public void setSex(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.user_person.sex</code>.
     */
    public String getSex() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.user_person.is_system</code>.
     */
    public void setIsSystem(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.user_person.is_system</code>.
     */
    public Byte getIsSystem() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>test.user_person.salt</code>.
     */
    public void setSalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.user_person.salt</code>.
     */
    public String getSalt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.user_person.password_salt</code>.
     */
    public void setPasswordSalt(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.user_person.password_salt</code>.
     */
    public String getPasswordSalt() {
        return (String) get(5);
    }

    /**
     * Setter for <code>test.user_person.regist_datetime</code>.
     */
    public void setRegistDatetime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>test.user_person.regist_datetime</code>.
     */
    public Timestamp getRegistDatetime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>test.user_person.last_login_datetime</code>.
     */
    public void setLastLoginDatetime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>test.user_person.last_login_datetime</code>.
     */
    public Timestamp getLastLoginDatetime() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, Byte, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, Byte, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserPerson.USER_PERSON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserPerson.USER_PERSON.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserPerson.USER_PERSON.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UserPerson.USER_PERSON.IS_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UserPerson.USER_PERSON.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserPerson.USER_PERSON.PASSWORD_SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserPerson.USER_PERSON.REGIST_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return UserPerson.USER_PERSON.LAST_LOGIN_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPasswordSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getRegistDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastLoginDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value3(String value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value4(Byte value) {
        setIsSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value5(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value6(String value) {
        setPasswordSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value7(Timestamp value) {
        setRegistDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord value8(Timestamp value) {
        setLastLoginDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPersonRecord values(Long value1, String value2, String value3, Byte value4, String value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPersonRecord
     */
    public UserPersonRecord() {
        super(UserPerson.USER_PERSON);
    }

    /**
     * Create a detached, initialised UserPersonRecord
     */
    public UserPersonRecord(Long id, String username, String sex, Byte isSystem, String salt, String passwordSalt, Timestamp registDatetime, Timestamp lastLoginDatetime) {
        super(UserPerson.USER_PERSON);

        set(0, id);
        set(1, username);
        set(2, sex);
        set(3, isSystem);
        set(4, salt);
        set(5, passwordSalt);
        set(6, registDatetime);
        set(7, lastLoginDatetime);
    }
}
