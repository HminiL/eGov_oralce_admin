package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDTO, Integer>{
	List<CustomerDTO> findByName(String custName);
	List<CustomerDTO> findByAddress(String address);
	List<CustomerDTO> findByPhone(String phone);
	
}
