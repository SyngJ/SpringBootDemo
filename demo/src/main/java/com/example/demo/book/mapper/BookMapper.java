package com.example.demo.book.mapper ;

import com.example.demo.book.DO.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    //查询
     List<Book> queryAll();

}
