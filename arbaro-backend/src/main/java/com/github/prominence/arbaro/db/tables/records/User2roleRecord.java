/*
 * This file is generated by jOOQ.
 */
package com.github.prominence.arbaro.db.tables.records;


import com.github.prominence.arbaro.db.tables.User2role;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class User2roleRecord extends UpdatableRecordImpl<User2roleRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 534904696;

    /**
     * Setter for <code>public.user2role.id</code>.
     */
    public User2roleRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user2role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user2role.user_id</code>.
     */
    public User2roleRecord setUserId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user2role.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.user2role.role_id</code>.
     */
    public User2roleRecord setRoleId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.user2role.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User2role.USER2ROLE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return User2role.USER2ROLE.USER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return User2role.USER2ROLE.ROLE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public Integer component3() {
        return getRoleId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public Integer value3() {
        return getRoleId();
    }

    @Override
    public User2roleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public User2roleRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public User2roleRecord value3(Integer value) {
        setRoleId(value);
        return this;
    }

    @Override
    public User2roleRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached User2roleRecord
     */
    public User2roleRecord() {
        super(User2role.USER2ROLE);
    }

    /**
     * Create a detached, initialised User2roleRecord
     */
    public User2roleRecord(Integer id, Integer userId, Integer roleId) {
        super(User2role.USER2ROLE);

        set(0, id);
        set(1, userId);
        set(2, roleId);
    }
}
