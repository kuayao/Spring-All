package com.springcloud.bookservicenetfilix.controller;

import com.springcloud.bookservicenetfilix.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kuayao
 * @create 2020-05-24 3:14 下午
 */

@RestController
public class BookController {

    @GetMapping("/bsn")
    public Book findBySN(String sn, HttpServletRequest request){
        Book book = null;
        if (sn.equals("1111")){
            book=new Book("1111","测试图书1",String.valueOf(request.getLocalPort()));
        }else if (sn.equals("2222")){
            book=new Book("2222","测试图书2",String.valueOf(request.getLocalPort()));
        }else if (sn.equals("3333")){
            book=new Book("3333","测试图书3",String.valueOf(request.getLocalPort()));
        }
        return book;
    }
}
