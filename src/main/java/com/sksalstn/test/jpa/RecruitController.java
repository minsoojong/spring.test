package com.sksalstn.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sksalstn.test.jpa.domain.Recruit;
import com.sksalstn.test.jpa.repository.RecruitRepository;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/select")
	@ResponseBody
	public List<Recruit> selectRecruit() {
		
//		List<Recruit> recruitList = recruitRepository.findById(8);
		
		List<Recruit> recruitList = recruitRepository.findTop1ByRecruitQuery(1);


		return recruitList;
		
	}
	
	

}
