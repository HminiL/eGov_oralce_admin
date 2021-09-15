package shop.jarviis.oracle.order.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.domain.OrderDTO;
import shop.jarviis.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderDTO order;
	@Autowired OrderService orderService;
	
	@RequestMapping(value = "/order", method= {RequestMethod.POST})
	public String order(
			@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate
			) { 
		System.out.println("orderId : " + orderId);
		System.out.println("custId : "+ custId);
		System.out.println("bookId : " + bookId);
		System.out.println("orderPrice : " + orderPrice);
		System.out.println("orderDate : " + orderDate);
		order = new OrderDTO();
		order.setOrderId(orderId);
		order.setCustId(custId);
		order.setBookId(bookId);
		order.setOrderPrice(orderPrice);
		order.setOrderDate(orderDate);
		orderService.save(order);
		return "";}

}
