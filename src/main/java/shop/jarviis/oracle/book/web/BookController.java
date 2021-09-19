package shop.jarviis.oracle.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.jarviis.oracle.book.model.BookDTO;
import shop.jarviis.oracle.book.model.BookService;

@Controller
@RequestMapping("/books")
public class BookController{
	
	@Autowired BookService bookService;
	@Autowired BookDTO book;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(BookDTO t) {
		// TODO Auto-generated method stub
		bookService.save(t);
		System.out.println(t.toString());
		
	}
	@RequestMapping("/detail/id")
	public String findById(Integer id) {
		// TODO Auto-generated method stub
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
		return "index";
	}
	@RequestMapping("/list")
	public String findAll() {
		// TODO Auto-generated method stub
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
		
		return "index";
	}
	@RequestMapping("/update")
	public void update(BookDTO t) {
		// TODO Auto-generated method stub
		bookService.update(t);
		System.out.println(t.toString());
		
	}
	
	@RequestMapping("/delete")
	public void delete(Integer bookId) {
		// TODO Auto-generated method stub
		bookService.delete(bookId);
		System.out.println("삭제완료"+ bookId);
		
	}
	
	@RequestMapping("/detail/pubId")
	public void findByPubId(Integer pubId) {
		List<BookDTO> books = bookService.findByPubId(pubId);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/detail/bookTitle")
	public void findByName(String bookTitle) {
		List<BookDTO> books = bookService.findByBookTitle(bookTitle);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	
	

	
	
	}

