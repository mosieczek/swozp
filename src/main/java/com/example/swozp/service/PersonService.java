package com.example.swozp.service;

import com.example.swozp.model.Person;
import com.example.swozp.model.Role;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public interface PersonService {
    void save(Person person);

    Person findByUsername(String email);
    
    void add_role(Person person, Role role);
    
    Collection<? extends GrantedAuthority> getAuthorities(Role role);
}