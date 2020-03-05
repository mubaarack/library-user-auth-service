package com.teal.library.springsecurityjwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

	
	// future implementation will use actual values from UI and query database
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("James", "pass",
                new ArrayList<>());
    }
}