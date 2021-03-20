package com.example.LMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LMS.Entity.Books;
import com.example.LMS.Exception.BookNotFoundExceptionClass;
import com.example.LMS.UserRepository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookRepository bookRepo;
	
	@GetMapping(path = "/borrow/{id}")
	public Books borrowBook(@PathVariable Integer id) {
		Books book = bookRepo.findById(id).orElseThrow(() -> new BookNotFoundExceptionClass("Book Not Found"));
	    return book;
	}

}
