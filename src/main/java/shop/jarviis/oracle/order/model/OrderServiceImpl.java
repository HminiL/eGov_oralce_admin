package shop.jarviis.oracle.order.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired OrderMapper orderMapper;
	
	@Override
	public void save(OrderDTO order) {
		// TODO Auto-generated method stub
		orderMapper.save(order);
		
	}

}
