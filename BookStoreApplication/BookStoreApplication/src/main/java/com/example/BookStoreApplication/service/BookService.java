package com.example.BookStoreApplication.service;

import com.example.BookStoreApplication.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository ;
    private final EmailService emailService ;

   public BookService(BookRepository bookRepository,EmailService emailService){
        this.bookRepository = bookRepository ;
        this.emailService = emailService ;
    }


    public String fetchAllBook(){
       return bookRepository.findAllBook() ;
    }

    public String orderBook(String bookName){
       bookRepository.saveOrder(bookName);
       emailService.sendEmail(bookName);
       return "Order placed for book: "+bookName ;
    }
}
