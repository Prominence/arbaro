package com.github.prominence.arbaro.conf;

import com.github.prominence.arbaro.repository.UserRepository;
import com.github.prominence.arbaro.security.ArbaroUserDetailsService;
import com.github.prominence.arbaro.security.PlainPasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity http) {
        http
            .authorizeExchange()
            .pathMatchers("/error").permitAll()
            .anyExchange()
            .authenticated()
            .and()
            .httpBasic()
            .and()
            .formLogin();
        return http.build();
    }

    @Bean
    public ReactiveUserDetailsService userDetailsService(UserRepository userRepository) {
        return new ArbaroUserDetailsService(userRepository);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new PlainPasswordEncoder();
    }
}
