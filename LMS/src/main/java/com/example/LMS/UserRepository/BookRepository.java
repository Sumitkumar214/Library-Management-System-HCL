package com.example.LMS.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LMS.Entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
