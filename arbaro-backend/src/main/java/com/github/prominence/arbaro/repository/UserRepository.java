package com.github.prominence.arbaro.repository;

import com.github.prominence.arbaro.db.tables.records.UserRecord;
import com.github.prominence.arbaro.entity.User;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.github.prominence.arbaro.db.tables.User.USER;

@Repository
public class UserRepository {

    private DSLContext sql;

    @Autowired
    public UserRepository(DSLContext sql) {
        this.sql = sql;
    }

    public User create(User newUser) {
        Record createdUser = sql.insertInto(USER)
            .set(USER.EMAIL, newUser.getEmail())
            .set(USER.PASSWORD, newUser.getPassword())
            .set(USER.ISACTIVE, newUser.isActive())
        .returning(USER.ID)
        .fetchOne();

        newUser.setId(createdUser.get(USER.ID).longValue());
        return newUser;
    }

    public User findByEmail(String username) {
        UserRecord userRecord = sql.selectFrom(USER)
            .where(USER.EMAIL.eq(username)).fetchAny();

        if (userRecord != null) {
            return User.builder()
                .email(userRecord.getEmail())
                .password(userRecord.getPassword())
                .id(userRecord.getId().longValue())
                .isActive(userRecord.getIsactive())
                .build();
        }
        return null;
    }
}
