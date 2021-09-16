package shop.jarviis.oracle.publisher.model;

import org.springframework.stereotype.Repository;

@Repository
public interface PublisherMapper {

	void save(PublisherDTO publisher);

}
