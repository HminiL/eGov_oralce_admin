package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired CustomerService customerService;
	
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDTO> customers = customerService.findAll();
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	@RequestMapping("/customers/ctId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		System.out.println(custId);
		System.out.println(customerService.findByCustId(custId).toString());
		
	}

	@RequestMapping("/customers/ctName/{custName}")
	public void findByCustName(@PathVariable String custName) {
		List<CustomerDTO> customers = customerService.findByCustName(custName);
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@RequestMapping("/customers/ctAddress/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDTO> customers = customerService.findByAddress(address);
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@RequestMapping("/customers/ctPhone/{phone}")
	public void findByPhone(@PathVariable String phone) {
	List<CustomerDTO> customers = customerService.findByPhone(phone);
	for(CustomerDTO customer : customers) {
		System.out.println(customer.toString());
		}
	}
	
}
