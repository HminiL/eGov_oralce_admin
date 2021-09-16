package shop.jarviis.oracle.publisher.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService{
	
	@Autowired PublisherMapper publisherMapper;

	@Override
	public void save(PublisherDTO publisher) {
		// TODO Auto-generated method stub
		publisherMapper.save(publisher);
	}

}
