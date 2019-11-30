package com.gg.bookweb.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gg.entity.Book;
import com.gg.mapper.BookMapper;
import com.gg.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author liqingjian
 * @Date 2019/11/30
 */
@Service
public class BookService implements IBookService {

    @Autowired
    private BookMapper mapper;

    @Override
    public Book getBook() {
        return mapper.selectById(1);
    }
}
