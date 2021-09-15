package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired BookService bookService;
	@Autowired BookDTO book;
	
	@RequestMapping(value="/book", method= {RequestMethod.POST})
	public String book(
			@RequestParam("bookId") int bookId,
			@RequestParam("bookTitle") String bookTitle,
			@RequestParam("pubId") int pubId,
			@RequestParam("price") int price) {
		System.out.println("bookId : "+ bookId);
		System.out.println("bookTitle : "+ bookTitle);
		System.out.println("pubId : "+ pubId);
		System.out.println("price : "+ price);
		book = new BookDTO();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setPubId(pubId);
		book.setPrice(price);
		bookService.save(book);
		return "/book/Book";
		
	}
	
	@RequestMapping("/")
	public void findAll(){
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDTO book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDTO> books = bookService.findByPubId(pubId);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
		
	}
	
	@RequestMapping("/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDTO> books = bookService.findByBookTitle(bookTitle);
		for(BookDTO book : books){
			System.out.println(book.toString());
			}
		}
	
	@RequestMapping("/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDTO> books = bookService.findByPrice(price);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	
	
	}

