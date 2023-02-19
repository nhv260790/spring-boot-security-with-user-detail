package com.spring.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<com.spring.security.dto.User, Integer>{
	
//	private final static List<UserDetails> APP_USERS = Arrays.asList(
//			new User("viet@gmail.com", "password", Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN")) ),
//			new User("diem@gmail.com", "password", Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")))
//			);
//	
//	public UserDetails findUserDetailsByEmail(String email) {
//		return APP_USERS
//				.stream()
//				.filter(u -> u.getUsername().equalsIgnoreCase(email))
//				.findFirst()
//				.orElseThrow(() -> new UsernameNotFoundException("Can not find username with email " + email ));
//	}

	List<com.spring.security.dto.User> findByUsername(String username);
}
