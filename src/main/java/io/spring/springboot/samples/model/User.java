package io.spring.springboot.samples.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usertable")
public class User {
	
	@Id
	public String accountNo;
	public String name;
	public String phone;
	public String email;
	
	public User(){}
	public User(String accountNo, String name, String phone, String email){
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
