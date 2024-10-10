package com.atria.angularproject;

import jakarta.persistence.Entity;
@Entity
public class User {
	
	@jakarta.persistence.Id
	private Integer Id;
	private String Username;
	private String Email;
	private String Password;
	public User(){
		
		
	}
	public User(Integer id, String username, String email, String password) {
		super();
		this.Id = id;
		this.Username = username;
		this.Email = email;
		this.Password = password;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Username=" + Username + ", Email=" + Email + ", Password=" + Password
				+ ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
