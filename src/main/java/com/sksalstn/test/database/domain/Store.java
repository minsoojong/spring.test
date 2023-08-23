package com.sksalstn.test.database.domain;

import java.util.Date;

public class Store {
	
	private int id;
	private String name;
	private String phoneNumber;
	private String address;
	private String businessNumber;
	private String introduce;
	private Date createAt;
	private Date updateAt;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Date getCreatedAt() {
		return createAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updateAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updateAt = updatedAt;
	}
	
	
	

}
