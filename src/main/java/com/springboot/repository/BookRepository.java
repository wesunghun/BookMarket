package com.springboot.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springboot.domain.Book;

public interface BookRepository {
	List<Book> getAllBookList();
	Book getBookById(String bookId);
	void setNewBook(Book book);
	void setUpdateBook(Book book);
	void setDeleteBook(String bookID);
	List<Book> getBookListByCategory(String category);
	Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}
