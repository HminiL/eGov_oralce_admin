package shop.jarviis.oracle;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
