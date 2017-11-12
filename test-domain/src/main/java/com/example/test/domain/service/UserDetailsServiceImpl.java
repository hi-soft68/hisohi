package com.example.test.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    MessageSourceImpl message;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        if (!email.equals("aaaa")) {
            throw new UsernameNotFoundException(message.getMessage("test.error"));
        }

        return null;
    }

}
