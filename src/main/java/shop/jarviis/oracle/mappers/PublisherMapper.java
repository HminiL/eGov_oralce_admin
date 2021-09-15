package shop.jarviis.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Repository
public interface PublisherMapper {

	void save(PublisherDTO publisher);

}
