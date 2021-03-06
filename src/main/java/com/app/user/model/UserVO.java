package com.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/*
 *  Author : CJKIM
 *  Date : 2021.8.31
 *  Version : V1.2
 */

@Data
@AllArgsConstructor
@ToString
public class UserVO {

	private String id;
	private String name;
	private String phone;
	private String address;
	
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public UserVO(String id, String name, String phone, String address) {
//		this.id = id;
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//	}
//	
//	@Override
//	public String toString() {
//		return "UserVO [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
//	}
}
