package com.sksalstn.test.realtor.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtorRepository {
	
	public int insertRealtor(
			@Param("id") int id
			, @Param("office") String office
			, @Param("phoneNumber") String phoneNumber
			, @Param("address") String address
			, @Param("grade") String grade);
			
	
		
}


