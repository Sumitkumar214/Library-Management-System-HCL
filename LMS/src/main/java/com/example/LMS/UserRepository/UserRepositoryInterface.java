package com.example.LMS.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LMS.Entity.User;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
}
