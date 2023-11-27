package com.example.bookstoremanager.Service;

import com.example.bookstoremanager.dto.BookDTO;
import com.example.bookstoremanager.dto.MessageResponseDTO;
import com.example.bookstoremanager.entity.Book;
import com.example.bookstoremanager.exception.BookNotFoundException;
import com.example.bookstoremanager.mapper.BookMapper;
import com.example.bookstoremanager.repositpry.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class BookService {
    private final BookMapper.INSTANCE;
    private IBookRepository bookRepository;
    @Autowired
    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static BookDTO findById(Long id) {
        IBookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        return BookMapper.toDTO(book);
    }

    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
       Book bookToSave =  BookMapper.toModel(bookDTO);
       Book savedBook = bookRepository.save(bookToSave);
       return MessageResponseDTO.builder()
               .message()
               .bild();

    }
}
