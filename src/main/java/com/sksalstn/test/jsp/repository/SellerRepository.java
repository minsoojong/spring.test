package com.sksalstn.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.sksalstn.test.jsp.domain.Seller;

@Repository
public interface SellerRepository {
	
	public int insertSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImge") String profileImge
			, @RequestParam("temperature") double temperature);
	
	public Seller selectLastSeller();
	
	public Seller selectSeller(@Param("id") int id);
	


}
