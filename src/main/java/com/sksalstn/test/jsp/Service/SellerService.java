package com.sksalstn.test.jsp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.test.jsp.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addseller(String nickname, String profileImge, double temperature) {
		int count = sellerRepository.insertSeller(nickname, profileImge, temperature);
		
		return count;
	}
	
	

}
