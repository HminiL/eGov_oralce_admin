package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired CustomerService customerService;
	@Autowired CustomerDTO customer;
	

	@RequestMapping(value="/register", method= {RequestMethod.POST})
	public String save(CustomerDTO customer) {
		System.out.println(customer.toString());
		customerService.save(customer);
		return "회원가입 성공";
		
	}
	
	@RequestMapping(value = "/update" , method= {RequestMethod.POST})
	public void update(CustomerDTO customer) {
		customerService.update(customer);
		System.out.println("update 완료 : "+customer);
	}
	
	@RequestMapping(value = "/update", method= {RequestMethod.POST})
	public void delete(CustomerDTO customer) {
		System.out.println("delete 완료 : ");
	}
	
	@RequestMapping("/list")
	public List<CustomerDTO> findAll () {
		List<CustomerDTO> customers = customerService.findAll();
		for (CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
		return customers;
	}
	

		@RequestMapping(value="/login", method= {RequestMethod.POST})
		public String login() {
			return "로그인 성공";
	}
	
	@RequestMapping("/detail")
	public String findById(@RequestParam("custId") int custId) {
		System.out.println(customerService.findById(custId).toString());
		return "아이디로 찾기";
		
	}

	@RequestMapping("/detail/name")
	public List<CustomerDTO> findByName(@RequestParam("custName") String custName) {
		List<CustomerDTO> customers = customerService.findByName(custName);
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
		return customers;
	}
	
	@RequestMapping("/address")
	public void findByAddress(@RequestParam("address") String address) {
		List<CustomerDTO> customers = customerService.findByAddress(address);
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@RequestMapping("/phone")
	public void findByPhone(@RequestParam("phone") String phone) {
	List<CustomerDTO> customers = customerService.findByPhone(phone);
	for(CustomerDTO customer : customers) {
		System.out.println(customer.toString());
		}
	}
	
}
