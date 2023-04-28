package com.javatechie;

import com.javatechie.entity.Book;
import com.javatechie.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SbDockerComposeApplication {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return bookRepository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SbDockerComposeApplication.class, args);
	}

}
