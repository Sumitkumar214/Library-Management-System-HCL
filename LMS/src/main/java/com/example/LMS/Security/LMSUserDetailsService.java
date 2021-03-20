package com.example.LMS.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.LMS.Entity.User;
import com.example.LMS.UserRepository.UserRepositoryInterface;

public class LMSUserDetailsService  implements UserDetailsService{
	
	@Autowired
	private PasswordEncoder passwordencoder;
	
	@Autowired
	private UserRepositoryInterface userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepo.findByEmail(username);
		if(user == null){
			throw new UsernameNotFoundException(username);
		}
		User user1 = new User();
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		return new LMSUserDetails(user1);
	}

}
