/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.persistence.model.Author;
import com.mycompany.persistence.model.Book;
import com.mycompany.persistence.repo.AuthorRepository;
import com.mycompany.persistence.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gino
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    BookRepository repo;
    
    @Autowired
    AuthorRepository authorRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Book> homePage(Model model) {
        Book book = new Book();
        Author author = new Author();
        author.setNombre("Ludwing");
        authorRepo.save(author);
        book.setAuthor(author);
        book.setTitle("asdasd");
        book.setAuthores("zzzz");
        repo.save(book);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }
}
