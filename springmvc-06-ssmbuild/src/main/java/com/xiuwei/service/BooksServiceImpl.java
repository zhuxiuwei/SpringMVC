package com.xiuwei.service;

import com.xiuwei.dao.BooksMapper;
import com.xiuwei.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books selectBookById(int id) {
        return booksMapper.selectBookById(id);
    }

    public List<Books> selectBooks() {
        return booksMapper.selectBooks();
    }
}
