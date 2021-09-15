package shop.jarviis.oracle.book.service;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.book.domain.BookDTO;

@Component
public interface BookService {
	public List<BookDTO> findAll();
	public BookDTO findById(int bookId);
	public List<BookDTO> findByPubId(int pubId);
	public List<BookDTO> findByBookTitle(String bookTitle);
	public List<BookDTO> findByPrice(int price);
	public void save(BookDTO book);
	
}
