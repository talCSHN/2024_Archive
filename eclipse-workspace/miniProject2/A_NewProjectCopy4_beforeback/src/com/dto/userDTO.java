package com.dto;

public class userDTO {
	int user_id;
	String username;
	String password;
	String email;
	String created_at;
	String role;
	
	public userDTO() {}

	public userDTO(int user_id, String username, String password, String email, String created_at, String role) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.created_at = created_at;
		this.role = role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "userDTO [user_id=" + user_id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", created_at=" + created_at + ", role=" + role + "]";
	}
	
	
}
