package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerMapper custmomerMapper;
	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return custmomerMapper.findAll();
	}


	@Override
	public List<CustomerDTO> findByCustName(String custName) {
		// TODO Auto-generated method stub
		return custmomerMapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDTO> findByAddress(String address) {
		// TODO Auto-generated method stub
		return custmomerMapper.findByAddress(address);
	}

	@Override
	public List<CustomerDTO> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return custmomerMapper.findByPhone(phone);
	}



	@Override
	public CustomerDTO findByCustId(int custId) {
		// TODO Auto-generated method stub
		return custmomerMapper.findByCustId(custId);
	}

	

}
