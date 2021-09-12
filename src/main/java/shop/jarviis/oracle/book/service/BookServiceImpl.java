package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;

	@Override
	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

	@Override
	public BookDTO findById(int bookId) {
		// TODO Auto-generated method stub
		return bookMapper.findById(bookId);
	}

	@Override
	public List<BookDTO> findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return bookMapper.findByPubId(pubId);
	}

	@Override
	public List<BookDTO> findByBookTitle(String bookTitle) {
		// TODO Auto-generated method stub
		return bookMapper.findByBookTitle(bookTitle);
	}

	@Override
	public List<BookDTO> findByPrice(int price) {
		// TODO Auto-generated method stub
		return bookMapper.findByPrice(price);
	}

	

	
}
