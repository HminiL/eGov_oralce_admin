package shop.jarviis.oracle.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.model.BookDTO;
import shop.jarviis.oracle.common.GenericInterface;

@Repository @Mapper
public interface BookMapper extends GenericInterface<BookDTO, Integer> {
	public String findByPubId(int pubId);
	public List <BookDTO> findByBookTitle(String bookTitle);
	public List <BookDTO> findByPrice(int price);
}
