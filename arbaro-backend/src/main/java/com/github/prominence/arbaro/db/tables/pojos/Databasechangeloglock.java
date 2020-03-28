/*
 * This file is generated by jOOQ.
 */
package com.github.prominence.arbaro.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;


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
public class Databasechangeloglock implements Serializable {

    private static final long serialVersionUID = 552380103;

    private final Integer   id;
    private final Boolean   locked;
    private final Timestamp lockgranted;
    private final String    lockedby;

    public Databasechangeloglock(Databasechangeloglock value) {
        this.id = value.id;
        this.locked = value.locked;
        this.lockgranted = value.lockgranted;
        this.lockedby = value.lockedby;
    }

    public Databasechangeloglock(
        Integer   id,
        Boolean   locked,
        Timestamp lockgranted,
        String    lockedby
    ) {
        this.id = id;
        this.locked = locked;
        this.lockgranted = lockgranted;
        this.lockedby = lockedby;
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    public Timestamp getLockgranted() {
        return this.lockgranted;
    }

    public String getLockedby() {
        return this.lockedby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangeloglock (");

        sb.append(id);
        sb.append(", ").append(locked);
        sb.append(", ").append(lockgranted);
        sb.append(", ").append(lockedby);

        sb.append(")");
        return sb.toString();
    }
}
