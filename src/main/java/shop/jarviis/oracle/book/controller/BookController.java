package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.book.service.BookService;

@Controller
public class BookController {
	
	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll(){
		List<BookDTO> list = bookService.findAll();
		for(BookDTO b : list) {
			System.out.println(b.toString());
		}
	}

}
