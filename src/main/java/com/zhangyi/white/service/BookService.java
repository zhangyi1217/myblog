package com.zhangyi.white.service;

import com.zhangyi.white.dao.BookDAO;
import com.zhangyi.white.entity.Book;
import com.zhangyi.white.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO;

    @Autowired
    CategoryService categoryService;

    public List<Book> list(){
        return bookDAO.findAll();
    }

    public void addOrUpdate(Book book){
        bookDAO.save(book);
    }

    public void deleteById(int id){
        bookDAO.deleteById(id);
    }

    public List<Book> listByCategory(int cid){
        Category category = categoryService.get(cid);
        return bookDAO.findAllByCategory(category);
    }

}
