package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDTO, Integer>{
	List<CustomerDTO> findByName(String custName);
	List<CustomerDTO> findByAddress(String address);
	List<CustomerDTO> findByPhone(String phone);
	
}
