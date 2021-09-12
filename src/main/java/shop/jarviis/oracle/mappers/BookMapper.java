package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.domain.BookDTO;

@Repository
public interface BookMapper {
	public List<BookDTO> findAll();
	public BookDTO findById(int bookId);
	public List <BookDTO> findByPubId(int pubId);
	public List <BookDTO> findByBookTitle(String bookTitle);
	public List <BookDTO> findByPrice(int price);
}
