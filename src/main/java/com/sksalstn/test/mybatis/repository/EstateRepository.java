package com.sksalstn.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sksalstn.test.mybatis.domain.Estate;

@Repository
public interface EstateRepository {
	
	// 전달받은 id와 일치하는 한행의 매물정보를 돌려주는 기능
	public Estate selectEstate(@Param("id") int id);

	// 전달받은 월세보다 낮은 매물 정보 행들을 돌려주는 기능
	public List<Estate> selectEstateByRentPrice(@Param("rentPrice") int rentPrice);
	
	
}


