package com.example.models;

public class CustomerDetailsReq {
	int id;

	//empty constructer is needed for JSON deserialization
	public CustomerDetailsReq() {}
	
	public CustomerDetailsReq(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
