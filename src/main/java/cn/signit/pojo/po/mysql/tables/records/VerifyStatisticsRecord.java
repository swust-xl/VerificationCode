/*
 * This file is generated by jOOQ.
*/
package cn.signit.pojo.po.mysql.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import cn.signit.pojo.po.mysql.tables.VerifyStatistics;


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
public class VerifyStatisticsRecord extends UpdatableRecordImpl<VerifyStatisticsRecord> implements Record6<String, Long, Long, Long, Long, Timestamp> {

    private static final long serialVersionUID = 1647412838;

    /**
     * Setter for <code>test.verify_statistics.username</code>. 用户名
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.verify_statistics.username</code>. 用户名
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.verify_statistics.count</code>. 调用验证总次数
     */
    public void setCount(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.verify_statistics.count</code>. 调用验证总次数
     */
    public Long getCount() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>test.verify_statistics.passed_count</code>. 验证通过次数
     */
    public void setPassedCount(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.verify_statistics.passed_count</code>. 验证通过次数
     */
    public Long getPassedCount() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>test.verify_statistics.refused_count</code>. 验证不通过次数
     */
    public void setRefusedCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.verify_statistics.refused_count</code>. 验证不通过次数
     */
    public Long getRefusedCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>test.verify_statistics.robot_count</code>. 被识别出是机器人的次数
     */
    public void setRobotCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.verify_statistics.robot_count</code>. 被识别出是机器人的次数
     */
    public Long getRobotCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>test.verify_statistics.last_invoke_datetime</code>. 最后一次调用时间
     */
    public void setLastInvokeDatetime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.verify_statistics.last_invoke_datetime</code>. 最后一次调用时间
     */
    public Timestamp getLastInvokeDatetime() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, Long, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, Long, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return VerifyStatistics.VERIFY_STATISTICS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return VerifyStatistics.VERIFY_STATISTICS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return VerifyStatistics.VERIFY_STATISTICS.PASSED_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return VerifyStatistics.VERIFY_STATISTICS.REFUSED_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return VerifyStatistics.VERIFY_STATISTICS.ROBOT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return VerifyStatistics.VERIFY_STATISTICS.LAST_INVOKE_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getPassedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRefusedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRobotCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLastInvokeDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getPassedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRefusedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRobotCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastInvokeDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value1(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value2(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value3(Long value) {
        setPassedCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value4(Long value) {
        setRefusedCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value5(Long value) {
        setRobotCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord value6(Timestamp value) {
        setLastInvokeDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatisticsRecord values(String value1, Long value2, Long value3, Long value4, Long value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VerifyStatisticsRecord
     */
    public VerifyStatisticsRecord() {
        super(VerifyStatistics.VERIFY_STATISTICS);
    }

    /**
     * Create a detached, initialised VerifyStatisticsRecord
     */
    public VerifyStatisticsRecord(String username, Long count, Long passedCount, Long refusedCount, Long robotCount, Timestamp lastInvokeDatetime) {
        super(VerifyStatistics.VERIFY_STATISTICS);

        set(0, username);
        set(1, count);
        set(2, passedCount);
        set(3, refusedCount);
        set(4, robotCount);
        set(5, lastInvokeDatetime);
    }
}