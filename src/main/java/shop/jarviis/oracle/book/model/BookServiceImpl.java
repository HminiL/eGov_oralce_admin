package shop.jarviis.oracle.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;

	@Override
	public void save(BookDTO t) {
		// TODO Auto-generated method stub
		bookMapper.save(t);
		
	}

	@Override
	public BookDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return bookMapper.findById(id);
	}

	@Override
	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

	@Override
	public void update(BookDTO t) {
		// TODO Auto-generated method stub
		bookMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bookMapper.delete(id);
		
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

	


