package com.example.booksearchapp.forms;

import com.example.booksearchapp.responses.LabelResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class SearchForm {
    String nameParam;
    String labelParam;
    String categoryParam;
}
