package com.sksalstn.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.test.mybatis.domain.Estate;
import com.sksalstn.test.mybatis.repository.EstateRepository;

@Service
public class EstateService {
	
	// 전달받은 id와 일치하는 매물정보를 돌려주는 기능
	
	@Autowired
	private EstateRepository estateRepository;
	
	public Estate getEstate(int id) {
		
		Estate estate = estateRepository.selectEstate(id);
		
		return estate;
	}
	
	// 전달받은 월세보다 낮은 매물정보 돌려주는 기능
	

	
	
	
	}
	
	
	


