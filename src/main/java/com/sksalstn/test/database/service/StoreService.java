package com.sksalstn.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.test.database.domain.Store;
import com.sksalstn.test.database.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	// 가게정보 리스트를 리턴
	public List<Store> getStoreList() {
		List<Store> storeList = storeRepository.selectStoreList();
		
		return storeList;
	}

}
