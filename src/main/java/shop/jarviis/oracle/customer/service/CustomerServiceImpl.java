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
	public void save(CustomerDTO t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.findById(id);
	}

	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public void update(CustomerDTO t) {
		// TODO Auto-generated method stub
		customerMapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerMapper.delete(id);
		
	}

	@Override
	public List<CustomerDTO> findByName(String custName) {
		// TODO Auto-generated method stub
		return customerMapper.findByName(custName);
	}

	@Override
	public List<CustomerDTO> findByAddress(String Address) {
		// TODO Auto-generated method stub
		return customerMapper.findByAddress(Address);
	}

	@Override
	public List<CustomerDTO> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return customerMapper.findByPhone(phone);
	}
	
	

}
