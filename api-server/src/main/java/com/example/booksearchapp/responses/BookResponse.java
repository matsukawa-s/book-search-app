package com.example.booksearchapp.responses;


import com.example.booksearchapp.entities.Category;
import com.example.booksearchapp.entities.Label;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookResponse {
    Integer id;
    String isbnCode;
    String name;
    Integer number;
    String imagePath;
    String link;
    List<Label> labels;
    List<Category> categories;
}
