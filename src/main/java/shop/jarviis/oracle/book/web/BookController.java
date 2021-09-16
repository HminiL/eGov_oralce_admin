package shop.jarviis.oracle.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.book.model.BookDTO;
import shop.jarviis.oracle.book.model.BookService;

@Controller
@RequestMapping("/books")
public class BookController{
	
	@Autowired BookService bookService;
	@Autowired BookDTO book;
	
	
	public void save(BookDTO t) {
		// TODO Auto-generated method stub
		
	}
	
	public BookDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void update(BookDTO t) {
		// TODO Auto-generated method stub
		
	}
	
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	}

