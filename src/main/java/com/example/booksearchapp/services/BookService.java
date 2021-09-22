package com.example.booksearchapp.services;

import com.example.booksearchapp.entities.Book;
import com.example.booksearchapp.mappers.BookMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    private final BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Transactional
    public List<Book> findAll(){
        return bookMapper.findAll();
    }
}
