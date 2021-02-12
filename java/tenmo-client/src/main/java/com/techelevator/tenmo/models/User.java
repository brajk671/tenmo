package com.techelevator.tenmo.models;

public class User {

	private Integer id;
	private String username;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
	    return "\n--------------------------------------------" +
	            "\n Users" +
	            "\n--------------------------------------------" +
	            "\n Id: " + id +
	            "\n Name: " + username;
	}
}
