package com.sksalstn.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sksalstn.test.mybatis.domain.Estate;
import com.sksalstn.test.mybatis.service.EstateService;

@Controller
@RequestMapping("/test/mybatis/estate")
public class EstateController {
	
	@Autowired
	private EstateService estateService;
	
	@RequestMapping("/test/mybatis/estate/1")
	@ResponseBody
	
	public Estate estate(@RequestParam("id") int id) {
		
		Estate estate = estateService.getEstate(id);
		
		return estate;
		
	}
	
//	@RequestMapping("/2")
//	public List<Estate> estateByRentPrice(@RequestParam("rent") int rentPrice) {
//		
//			List<Estate> estateList = estateService.getEstateByRentPrice(rentPrice);
//			
//			return estateList;
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
