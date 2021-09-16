package shop.jarviis.oracle.book.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDTO, Integer> {
	public String findByPubId(int pubId);
	public List <BookDTO> findByBookTitle(String bookTitle);
	public List <BookDTO> findByPrice(int price);
}
