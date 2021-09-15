package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService {
	public List<CustomerDTO> findAll();
	public CustomerDTO findByCustId(int custId);
	public List<CustomerDTO> findByCustName(String custName);
	public List<CustomerDTO> findByAddress(String address);
	public List<CustomerDTO> findByPhone(String phone);
	public void save(CustomerDTO customer);
}
