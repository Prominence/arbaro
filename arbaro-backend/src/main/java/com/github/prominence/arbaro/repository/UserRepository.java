package com.github.prominence.arbaro.repository;

import com.github.prominence.arbaro.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Person, Long> {

    Person findByEmail(String email);

}
