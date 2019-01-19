/*
 * This file is generated by jOOQ.
*/
package cn.signit.pojo.po.mysql.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import cn.signit.pojo.po.mysql.Indexes;
import cn.signit.pojo.po.mysql.Keys;
import cn.signit.pojo.po.mysql.Test;
import cn.signit.pojo.po.mysql.tables.records.VerifyStatisticsRecord;


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
public class VerifyStatistics extends TableImpl<VerifyStatisticsRecord> {

    private static final long serialVersionUID = -1142988596;

    /**
     * The reference instance of <code>test.verify_statistics</code>
     */
    public static final VerifyStatistics VERIFY_STATISTICS = new VerifyStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VerifyStatisticsRecord> getRecordType() {
        return VerifyStatisticsRecord.class;
    }

    /**
     * The column <code>test.verify_statistics.username</code>. 用户名
     */
    public final TableField<VerifyStatisticsRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "用户名");

    /**
     * The column <code>test.verify_statistics.count</code>. 调用验证总次数
     */
    public final TableField<VerifyStatisticsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "调用验证总次数");

    /**
     * The column <code>test.verify_statistics.passed_count</code>. 验证通过次数
     */
    public final TableField<VerifyStatisticsRecord, Long> PASSED_COUNT = createField("passed_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "验证通过次数");

    /**
     * The column <code>test.verify_statistics.refused_count</code>. 验证不通过次数
     */
    public final TableField<VerifyStatisticsRecord, Long> REFUSED_COUNT = createField("refused_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "验证不通过次数");

    /**
     * The column <code>test.verify_statistics.robot_count</code>. 被识别出是机器人的次数
     */
    public final TableField<VerifyStatisticsRecord, Long> ROBOT_COUNT = createField("robot_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "被识别出是机器人的次数");

    /**
     * The column <code>test.verify_statistics.last_invoke_datetime</code>. 最后一次调用时间
     */
    public final TableField<VerifyStatisticsRecord, Timestamp> LAST_INVOKE_DATETIME = createField("last_invoke_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后一次调用时间");

    /**
     * Create a <code>test.verify_statistics</code> table reference
     */
    public VerifyStatistics() {
        this(DSL.name("verify_statistics"), null);
    }

    /**
     * Create an aliased <code>test.verify_statistics</code> table reference
     */
    public VerifyStatistics(String alias) {
        this(DSL.name(alias), VERIFY_STATISTICS);
    }

    /**
     * Create an aliased <code>test.verify_statistics</code> table reference
     */
    public VerifyStatistics(Name alias) {
        this(alias, VERIFY_STATISTICS);
    }

    private VerifyStatistics(Name alias, Table<VerifyStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VerifyStatistics(Name alias, Table<VerifyStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VERIFY_STATISTICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VerifyStatisticsRecord> getPrimaryKey() {
        return Keys.KEY_VERIFY_STATISTICS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VerifyStatisticsRecord>> getKeys() {
        return Arrays.<UniqueKey<VerifyStatisticsRecord>>asList(Keys.KEY_VERIFY_STATISTICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatistics as(String alias) {
        return new VerifyStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStatistics as(Name alias) {
        return new VerifyStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VerifyStatistics rename(String name) {
        return new VerifyStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VerifyStatistics rename(Name name) {
        return new VerifyStatistics(name, null);
    }
}
