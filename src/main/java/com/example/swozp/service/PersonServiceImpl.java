package com.example.swozp.service;

import com.example.swozp.model.Person;
import com.example.swozp.model.Role;
import com.example.swozp.repository.PersonRepository;
import com.example.swozp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
public class PersonServiceImpl implements PersonService {
//	@Autowired
	private PersonRepository personRepository;
//	@Autowired
	private RoleRepository roleRepository;
//	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	public PersonServiceImpl() throws SQLException {
	}

	@Override
	public void save(Person person) {
		person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
		person.setRoles(new HashSet<>(roleRepository.findAll()));
		personRepository.save(person);
	}

	@Override
	public Person findByUsername(String username) {
		return personRepository.findByUsername(username);
	}

	@Override
	public void add_role(Person person, Role role) {
		Set<Role> newRoles = person.getRoles();
		if (newRoles == null) {
			newRoles = new HashSet<Role>();
		}
		newRoles.add(role);
		person.setRoles(newRoles);
		roleRepository.save(role);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(Role role) {
		final List<SimpleGrantedAuthority> authorities = new LinkedList<>();

		authorities.add(new SimpleGrantedAuthority(role.getName()));
		return authorities;
	}


}