package com.springcloud.memberserviceopenfeign.controller;

import com.springcloud.memberserviceopenfeign.client.BookService;
import com.springcloud.memberserviceopenfeign.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kuayao
 * @create 2020-05-24 6:22 下午
 */
@RestController
public class MemberConrtoller {

    @Resource
    private BookService bookService;

    @GetMapping("/borrow")
    public String borrow(String sn){
        Book book = bookService.findBySn(sn);

        return book.getName()+":"+book.getDesc()+"图书借阅成功";
    }


    @GetMapping("/s")
    public List<Book>  search(){
        Map param = new HashMap<>();
        param.put("sn","1111");
        param.put("name","x");
        List<Book>  list =  bookService.search(param);
        return  list;
    }

    @GetMapping("/c")
    public String compensate(){
        Book book = new Book();
        book.setName("赔偿图书");
        book.setSn("5555");
        String result = bookService.createBook(book);
        return result;
    }
}
