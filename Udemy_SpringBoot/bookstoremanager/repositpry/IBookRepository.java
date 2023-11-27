package com.example.bookstoremanager.repositpry;

import com.example.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
    

}
