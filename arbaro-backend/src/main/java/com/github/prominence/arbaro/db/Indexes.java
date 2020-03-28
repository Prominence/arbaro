/*
 * This file is generated by jOOQ.
 */
package com.github.prominence.arbaro.db;


import com.github.prominence.arbaro.db.tables.Databasechangeloglock;
import com.github.prominence.arbaro.db.tables.Role;
import com.github.prominence.arbaro.db.tables.User;
import com.github.prominence.arbaro.db.tables.User2role;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index DATABASECHANGELOGLOCK_PKEY = Indexes0.DATABASECHANGELOGLOCK_PKEY;
    public static final Index ROLE_PKEY = Indexes0.ROLE_PKEY;
    public static final Index ROLE_ROLE_KEY = Indexes0.ROLE_ROLE_KEY;
    public static final Index USER_EMAIL_KEY = Indexes0.USER_EMAIL_KEY;
    public static final Index USER_PKEY = Indexes0.USER_PKEY;
    public static final Index USER2ROLE_PKEY = Indexes0.USER2ROLE_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index DATABASECHANGELOGLOCK_PKEY = Internal.createIndex("databasechangeloglock_pkey", Databasechangeloglock.DATABASECHANGELOGLOCK, new OrderField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
        public static Index ROLE_PKEY = Internal.createIndex("role_pkey", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index ROLE_ROLE_KEY = Internal.createIndex("role_role_key", Role.ROLE, new OrderField[] { Role.ROLE.ROLE_ }, true);
        public static Index USER_EMAIL_KEY = Internal.createIndex("user_email_key", User.USER, new OrderField[] { User.USER.EMAIL }, true);
        public static Index USER_PKEY = Internal.createIndex("user_pkey", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER2ROLE_PKEY = Internal.createIndex("user2role_pkey", User2role.USER2ROLE, new OrderField[] { User2role.USER2ROLE.ID }, true);
    }
}
