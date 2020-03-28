/*
 * This file is generated by jOOQ.
 */
package com.github.prominence.arbaro.db.tables;


import com.github.prominence.arbaro.db.Indexes;
import com.github.prominence.arbaro.db.Keys;
import com.github.prominence.arbaro.db.Public;
import com.github.prominence.arbaro.db.tables.records.User2roleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User2role extends TableImpl<User2roleRecord> {

    private static final long serialVersionUID = -206410109;

    /**
     * The reference instance of <code>public.user2role</code>
     */
    public static final User2role USER2ROLE = new User2role();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<User2roleRecord> getRecordType() {
        return User2roleRecord.class;
    }

    /**
     * The column <code>public.user2role.id</code>.
     */
    public final TableField<User2roleRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user2role.user_id</code>.
     */
    public final TableField<User2roleRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user2role.role_id</code>.
     */
    public final TableField<User2roleRecord, Integer> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.user2role</code> table reference
     */
    public User2role() {
        this(DSL.name("user2role"), null);
    }

    /**
     * Create an aliased <code>public.user2role</code> table reference
     */
    public User2role(String alias) {
        this(DSL.name(alias), USER2ROLE);
    }

    /**
     * Create an aliased <code>public.user2role</code> table reference
     */
    public User2role(Name alias) {
        this(alias, USER2ROLE);
    }

    private User2role(Name alias, Table<User2roleRecord> aliased) {
        this(alias, aliased, null);
    }

    private User2role(Name alias, Table<User2roleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> User2role(Table<O> child, ForeignKey<O, User2roleRecord> key) {
        super(child, key, USER2ROLE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER2ROLE_PKEY);
    }

    @Override
    public UniqueKey<User2roleRecord> getPrimaryKey() {
        return Keys.USER2ROLE_PKEY;
    }

    @Override
    public List<UniqueKey<User2roleRecord>> getKeys() {
        return Arrays.<UniqueKey<User2roleRecord>>asList(Keys.USER2ROLE_PKEY);
    }

    @Override
    public List<ForeignKey<User2roleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<User2roleRecord, ?>>asList(Keys.USER2ROLE__FK_USER_ID, Keys.USER2ROLE__FK_ROLE_ID);
    }

    public User user() {
        return new User(this, Keys.USER2ROLE__FK_USER_ID);
    }

    public Role role() {
        return new Role(this, Keys.USER2ROLE__FK_ROLE_ID);
    }

    @Override
    public User2role as(String alias) {
        return new User2role(DSL.name(alias), this);
    }

    @Override
    public User2role as(Name alias) {
        return new User2role(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User2role rename(String name) {
        return new User2role(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User2role rename(Name name) {
        return new User2role(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}