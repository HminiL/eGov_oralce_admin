package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.order.model.OrderDTO;

@Repository
public interface OrderMapper {
	public List<OrderDTO> findAll();
	public List<OrderDTO> findByMgrName(String MgrName);
	public OrderDTO findById(int pubId);
	public OrderDTO findByPubName(String pubName);
	public List<OrderDTO> findByMgrPhone(String mgrPhone);
	public void save(OrderDTO order);

}
