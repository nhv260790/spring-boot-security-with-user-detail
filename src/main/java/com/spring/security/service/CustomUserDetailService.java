package com.spring.security.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<com.spring.security.dto.User> users = userRepository.findByUsername(username);
		
		
		
		if(users.size() > 0) {
			List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(users.get(0).getRole()));
			UserDetails userDetails = new User(username, users.get(0).getPassword(), authorities);
			return userDetails;
		}else {
			new UsernameNotFoundException("User does not exist!");
		}
		return null;
	}

}
