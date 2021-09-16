package shop.jarviis.oracle.publisher.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.publisher.model.PublisherDTO;
import shop.jarviis.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	
	@Autowired PublisherDTO publisher;
	@Autowired PublisherService publisherService;
	
	@RequestMapping(value = "/publisher" ,method= {RequestMethod.POST})
	public String publisher(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("mgrName") String mgrName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId : " + pubId);
		System.out.println("pubName : " +pubName);
		System.out.println("mgrName : " + mgrName);
		System.out.println("phone : " + phone);
		publisher = new PublisherDTO();
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisherService.save(publisher);
		return "/publiser/Publisher";}

}
