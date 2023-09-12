package com.sksalstn.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sksalstn.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer>{
	
	public List<Recruit> findById(int id);
	
	@Query(value="SELECT * FROM `recruit` WHERE `companyId` = :companyId", nativeQuery=true)
	public List<Recruit> findTop1ByRecruitQuery(@Param("companyId") int companyId);


}
