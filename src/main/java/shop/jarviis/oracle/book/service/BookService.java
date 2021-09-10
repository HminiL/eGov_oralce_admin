package shop.jarviis.oracle.book.service;


import java.util.List;

import shop.jarviis.oracle.book.domain.BookDTO;

public interface BookService {
	public List<BookDTO> findAll();
	public BookDTO findById(int bookId);
	
}
