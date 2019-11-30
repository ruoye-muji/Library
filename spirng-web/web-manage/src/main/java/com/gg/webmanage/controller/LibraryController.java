package com.gg.webmanage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gg.entity.Book;
import com.gg.service.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liqingjian
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("library")
public class LibraryController {

    @Reference
    private IBookService service;

    @RequestMapping("getBook")
    @ResponseBody
    private Book getBookList(){
        Book book = service.getBook();
        return book;
    }
}
