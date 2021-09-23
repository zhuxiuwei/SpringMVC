package com.xiuwei.controller;

import com.xiuwei.pojo.Books;
import com.xiuwei.service.BooksService;
import com.xiuwei.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    //跳转到添加书籍页面
    @RequestMapping("toAddBookPage")
    public String toAddBookPage(){
        return "addBook";
    }

    //实际添加书籍
    @RequestMapping("/add")
    public String addBook(Books books){
        booksService.addBook(books);
        return "redirect:/book/all";    //重定向到我们的请求
    }

    //删除书籍
    @RequestMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable int bookId){
        booksService.deleteBookById(bookId);
        return "redirect:/book/all";    //重定向到我们的请求
    }

    //修改书籍 - 到达修改页面
    @RequestMapping("/modifyPage/{bookId}")
    public String toUpdateBookPage(@PathVariable int bookId, Model model){
        Books books = booksService.selectBookById(bookId);
        model.addAttribute("bookInfo", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/update")
    public String toUpdateBookPage(Books book){
        booksService.updateBook(book);
        return "redirect:/book/all";    //重定向到我们的请求
    }
}
