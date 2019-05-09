package com.show.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.show.book.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByBookName(String bookName);

}
