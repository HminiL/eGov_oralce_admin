package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService extends GenericInterface<CustomerDTO, Integer>{

	public List<CustomerDTO> findByName(String custName);
	public List<CustomerDTO> findByAddress(String Address);
	public List<CustomerDTO> findByPhone(String phone);
	
}
