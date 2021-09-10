package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.domain.BookDTO;

@Repository
public interface BookMapper {
	public List<BookDTO> findAll();
}
