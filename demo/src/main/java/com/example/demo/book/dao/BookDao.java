package com.example.demo.book.dao;

import com.example.demo.book.DO.Book;
import com.example.demo.book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class BookDao {

      @Autowired
      private BookMapper bookMapper;

       public List<Book> getAllBook(){
           return bookMapper.queryAll();
       }

}
