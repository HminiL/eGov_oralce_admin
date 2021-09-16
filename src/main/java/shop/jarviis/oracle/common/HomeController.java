package shop.jarviis.oracle.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String join() {
		
		
		return "user/Join";
	}
	
	
	@RequestMapping(value = "/loginfrom", method = RequestMethod.GET)
	public String login() {
		
		
		return "user/Loign";
	}
	
	//get 방식은 method 생략 가능(default)
	@RequestMapping(value="/customers/detailform")
	public String detail() {
		return "user/Detail";
	}
	@RequestMapping(value="/customers/updateform")
	public String update() {
		return "user/Update";
	}
	
	@RequestMapping(value = "/bookform", method = RequestMethod.GET)
	public String book() {
		
		
		return "book/Book";
	}
	
	@RequestMapping(value = "/orderform", method = RequestMethod.GET)
	public String order() {
		
		
		return "order/Order";
	}
	@RequestMapping("/publisherform")
	public String publisher() {
		
		return "publisher/Publisher";
	}

}
