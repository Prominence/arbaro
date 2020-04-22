package com.github.prominence.arbaro.demo;

import com.github.prominence.arbaro.entity.Person;
import com.github.prominence.arbaro.entity.Role;
import com.github.prominence.arbaro.repository.RoleRepository;
import com.github.prominence.arbaro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class DemoUsersPopulator implements CommandLineRunner {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public DemoUsersPopulator(PasswordEncoder passwordEncoder, UserRepository userRepository, RoleRepository roleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Role userRole = roleRepository.findByName("ROLE_USER");
        Role adminRole = roleRepository.findByName("ROLE_ADMIN");

        List.of(
                Person.builder()
                        .email("root")
                        .password(passwordEncoder.encode("root"))
                        .isActive(true)
                        .roles(Set.of(userRole, adminRole))
                        .build(),
                Person.builder()
                        .email("user1")
                        .password(passwordEncoder.encode("user1"))
                        .isActive(true)
                        .roles(Set.of(userRole))
                        .build(),
                Person.builder()
                        .email("user2")
                        .password(passwordEncoder.encode("user2"))
                        .isActive(true)
                        .roles(Set.of(userRole))
                        .build()
        ).forEach(entity -> {
            if (userRepository.findByEmail(entity.getEmail()) == null) {
                userRepository.save(entity);
            }
        });
    }
}
