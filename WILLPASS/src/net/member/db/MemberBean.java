package net.member.db;

import java.util.*;
import java.sql.Timestamp;

public class MemberBean {	//DTO,VO
	
	private String user_id; 
	private String user_pwd; 
	private String user_email; 
	private String user_name; 
	//private Date  user_age; 
	private String user_mobile; 
	private String user_address; 
	private String user_non;
	//private String user_gender;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
//	public Date getUser_age() {
//		return user_age;
//	}
//	public void setUser_age(Date user_age) {
//		this.user_age = user_age;
//	}
	public String getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_non() {
		return user_non;
	}
	public void setUser_non(String user_non) {
		this.user_non = user_non;
	}
	
	
//	public String getUser_gender() {
//	return user_gender;
//	}
//	public void setUser_gender(String user_gender) {
//		this.user_gender = user_gender;
//	}
	
	
	
	
}
