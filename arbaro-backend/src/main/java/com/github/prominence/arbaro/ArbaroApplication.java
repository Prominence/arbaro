package com.github.prominence.arbaro;

import com.github.prominence.arbaro.entity.Role;
import com.github.prominence.arbaro.entity.User;
import com.github.prominence.arbaro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ArbaroApplication implements CommandLineRunner {

	private UserRepository userRepository;

	@Autowired
	public ArbaroApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ArbaroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*List.of(
				User.builder()
					.email("root")
					.password("root")
					.roles(Set.of(new Role("ROLE_ADMIN")))
					.build()
				,
				new User("user1", "user1"),
				new User("user2", "user2")
		).forEach(user -> userRepository.create(user));*/
	}
}
