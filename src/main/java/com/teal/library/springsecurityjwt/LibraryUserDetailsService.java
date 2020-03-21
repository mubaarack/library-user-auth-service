package com.teal.library.springsecurityjwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DataAccess db  = new DataAccess();
        if (!db.ExistsUser(username)) {
            throw new UsernameNotFoundException("User not found by name: " + username);
        }
        return toUserDetails(db.ValidateUser(username));
    }
    private UserDetails toUserDetails(com.teal.library.springsecurityjwt.models.User user) {
        return User.withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole()).build();
    }
}