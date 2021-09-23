package com.xiuwei.controller;

import com.xiuwei.pojo.Books;
import com.xiuwei.service.BooksService;
import com.xiuwei.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BooksService booksService;

    //查询全部数据，返回给jsp
    @RequestMapping("all")
    public String listAllBooks(Model model){
        List<Books> books = booksService.selectBooks();
        System.out.println(books);
        model.addAttribute("books", books );
        return "allBooks";
    }

}
