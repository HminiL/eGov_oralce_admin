package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerMapper customerMapper;
	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}


	@Override
	public List<CustomerDTO> findByCustName(String custName) {
		// TODO Auto-generated method stub
		return customerMapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDTO> findByAddress(String address) {
		// TODO Auto-generated method stub
		return customerMapper.findByAddress(address);
	}

	@Override
	public List<CustomerDTO> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return customerMapper.findByPhone(phone);
	}



	@Override
	public CustomerDTO findByCustId(int custId) {
		// TODO Auto-generated method stub
		return customerMapper.findByCustId(custId);
	}


	@Override
	public void save(CustomerDTO customer) {
		customerMapper.save(customer);
		// TODO Auto-generated method stub
		
	}

	

}
