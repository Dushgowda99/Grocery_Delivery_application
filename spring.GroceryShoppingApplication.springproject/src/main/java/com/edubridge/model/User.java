package com.edubridge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User {

	@Column(name="username" , unique=true)
	private String userName;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Id
	@SequenceGenerator(name="seq_user",sequenceName="UserSequence",initialValue=100,allocationSize=100)
   @GeneratedValue(generator="seq_user")
	private int userId;
	@Column( name="mobile_no",unique=true)
	private String mobile_no;
	@NotEmpty
	@Column(name="password")
	private   String password;
	@Column(name="email_id" , unique=true)
	private String email_id;
	@Column(name="tem_address")
	private  String tem_address;
	@Column(name="per_address")
	private  String per_address;
	@Column(name="role")
	private String role;
	

	
	
	
	public User() {
		
	}
	
	
	public User(String userName, String first_name, String last_name, String mobile_no, String password,
			String email_id, String tem_address, String per_address, String role) {
		super();
		this.userName = userName;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.password = password;
		this.email_id = email_id;
		this.tem_address = tem_address;
		this.per_address = per_address;
		this.role = role;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getTem_address() {
		return tem_address;
	}
	public void setTem_address(String tem_address) {
		this.tem_address = tem_address;
	}
	public String getPer_address() {
		return per_address;
	}
	public void setPer_address(String per_address) {
		this.per_address = per_address;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", userId=" + userId + ", mobile_no=" + mobile_no + ", password=" + password + ", email_id="
				+ email_id + ", tem_address=" + tem_address + ", per_address=" + per_address + ", role=" + role + "]";
	}
	
	    

}
