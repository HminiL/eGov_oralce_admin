package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.book.service.BookService;

@Controller
public class BookController {
	
	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll(){
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/books/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDTO book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDTO> books = bookService.findByPubId(pubId);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
		
	}
	
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDTO> books = bookService.findByBookTitle(bookTitle);
		for(BookDTO book : books){
			System.out.println(book.toString());
			}
		}
	
	@RequestMapping("/books/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDTO> books = bookService.findByPrice(price);
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	
	
	}

