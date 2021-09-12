package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Repository
public interface CustomerMapper {
	public List<CustomerDTO> findAll();
	public CustomerDTO findByCustId(int custId);
	public List<CustomerDTO> findByCustName(String custName);
	public List<CustomerDTO> findByAddress(String address);
	public List<CustomerDTO> findByPhone(String phone);
	
}
