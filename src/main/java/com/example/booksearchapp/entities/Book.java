package com.example.booksearchapp.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Long id;
    private String isbnCode;
    private String name;
    private String imagePath;
    private String link;
}
