package com.sksalstn.test.jsp.domain;

import java.util.Date;

public class Seller {
	
	public class seller {
		private int id;
		private String nickname;
		private String temperature;
		private String profileImage;
		private Date createdAt;
		private Date updatedAt;
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getTemperature() {
			return temperature;
		}
		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}
		public String getProfileImage() {
			return profileImage;
		}
		public void setProfileImage(String profileImage) {
			this.profileImage = profileImage;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		
		
		
	}

}
