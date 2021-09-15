package shop.jarviis.oracle.publisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.PublisherMapper;
import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Service
public class PublisherServiceImpl implements PublisherService{
	
	@Autowired PublisherMapper publisherMapper;

	@Override
	public void save(PublisherDTO publisher) {
		// TODO Auto-generated method stub
		publisherMapper.save(publisher);
	}

}
