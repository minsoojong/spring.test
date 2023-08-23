package com.sksalstn.test.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sksalstn.test.database.domain.Store;

@Repository
public interface StoreRepository {
	
	public List<Store> selectStoreList();

}
