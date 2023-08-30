package com.sksalstn.test.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sksalstn.test.realtor.domain.Realtor;
import com.sksalstn.test.realtor.service.RealtorService;


@Controller
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	// 전달된 공인중개사 정보를 저장하고, 결과를 태그로 구성해서 response에 담는다.
	@GetMapping("/jsp/realtor/creat")
	public String createRealtor(
			@RequestParam("office")String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade
			, Model model) {

			Realtor realtor = new Realtor();
			realtor.setOffice(office);
			realtor.setOffice(phoneNumber);
			realtor.setOffice(address);
			realtor.setOffice(grade);
			
			int count = realtorService.addRealtor(realtor);
			
			model.addAttribute("realtor", realtor);
			
			return "/jsp/realtorInfo";

	}
	
	@GetMapping("/input")
	public String realtorInput() {
		return "/jsp/realtorInput";
	}
	
	
	
	
	

}