package com.example.bookstoremanager.controller;

import com.example.bookstoremanager.Service.BookService;
import com.example.bookstoremanager.dto.BookDTO;
import com.example.bookstoremanager.dto.MessageResponseDTO;
import com.example.bookstoremanager.entity.Book;
import com.example.bookstoremanager.repositpry.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }
    @GetMapping("/{id}")
    public BookDTO findById (@PathVariable Long id){
        return BookService.findById(id);
    }


}

