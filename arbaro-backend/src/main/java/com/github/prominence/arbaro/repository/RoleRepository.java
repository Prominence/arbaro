package com.github.prominence.arbaro.repository;

import com.github.prominence.arbaro.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);
}
