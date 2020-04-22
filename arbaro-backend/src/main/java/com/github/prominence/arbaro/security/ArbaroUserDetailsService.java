package com.github.prominence.arbaro.security;

import com.github.prominence.arbaro.entity.Person;
import com.github.prominence.arbaro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ArbaroUserDetailsService implements UserDetailsService, UserDetailsPasswordService {

    private final UserRepository userRepository;

    @Autowired
    public ArbaroUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        Person person = userRepository.findByEmail(username);
        if (person == null) {
            throw new UsernameNotFoundException("User with '" +  username + "' email wasn't found.");
        }
        return person;
    }
}
