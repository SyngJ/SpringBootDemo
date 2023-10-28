package com.example.demo.book.controller;

import com.example.demo.book.DO.Book;
import com.example.demo.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookDao bookDao;

    @RequestMapping("list")
    public List<Book> list(){
        return bookDao.getAllBook();
    }


}

