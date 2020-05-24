package com.springcloud.memberserviceopenfeign.client;

import com.springcloud.memberserviceopenfeign.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author kuayao
 * @create 2020-05-24 6:17 下午
 */
@FeignClient(name = "book-service")
public interface BookService {

    @GetMapping("/bsn")
    public Book findBySn(@RequestParam("sn") String sn);


    @GetMapping("/search")
    public List<Book> search(@RequestParam Map book);

    @PostMapping("/create")
    public String createBook(@RequestBody Book book);
}
