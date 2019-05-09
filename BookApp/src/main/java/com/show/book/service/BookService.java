package com.show.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.show.book.model.AuthorModel;
import com.show.book.model.BookModel;
@Service
public interface BookService {
	
	public Long saveBookId(BookModel bookModel);
	public List<BookModel> findAllEntity();
	public List<String> getallauthorName(AuthorModel authorModel);
}
