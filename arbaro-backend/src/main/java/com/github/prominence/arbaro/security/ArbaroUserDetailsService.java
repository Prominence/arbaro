package com.github.prominence.arbaro.security;

import com.github.prominence.arbaro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.ReactiveUserDetailsPasswordService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Primary
public class ArbaroUserDetailsService implements ReactiveUserDetailsService, ReactiveUserDetailsPasswordService {

    private UserRepository userRepository;

    @Autowired
    public ArbaroUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UserDetails> updatePassword(UserDetails user, String newPassword) {
        return null;
    }

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return Mono.justOrEmpty(userRepository.findByEmail(username));
    }
}
