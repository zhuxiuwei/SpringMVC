package com.xiuwei.service;

import com.xiuwei.pojo.Books;

import java.util.List;

public interface BooksService {
    int addBook(Books books);
    int deleteBookById(int id);
    int updateBook(Books books);
    Books selectBookById(int id);
    List<Books> selectBooks();
}
