/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.GlobalStatusRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GlobalStatus extends TableImpl<GlobalStatusRecord> {

    /**
     * The reference instance of <code>information_schema.GLOBAL_STATUS</code>
     */
    public static final GlobalStatus GLOBAL_STATUS = new GlobalStatus();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.GLOBAL_STATUS.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.GLOBAL_STATUS.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus(String alias) {
        this(DSL.name(alias), GLOBAL_STATUS);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus(Name alias) {
        this(alias, GLOBAL_STATUS);
    }

    /**
     * Create a <code>information_schema.GLOBAL_STATUS</code> table reference
     */
    public GlobalStatus() {
        this(DSL.name("GLOBAL_STATUS"), null);
    }

    public <O extends Record> GlobalStatus(Table<O> child, ForeignKey<O, GlobalStatusRecord> key) {
        super(child, key, GLOBAL_STATUS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalStatusRecord> getRecordType() {
        return GlobalStatusRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public GlobalStatus as(String alias) {
        return new GlobalStatus(DSL.name(alias), this);
    }

    @Override
    public GlobalStatus as(Name alias) {
        return new GlobalStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(String name) {
        return new GlobalStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(Name name) {
        return new GlobalStatus(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}