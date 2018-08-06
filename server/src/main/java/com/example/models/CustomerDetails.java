package com.example.models;

public class CustomerDetails {
	  int id;
	String name;
	  String email;
	  String phone;
	  String city;
	  String state;
	  String country;
	  String organization;
	  String jobProfile;
	  String additionalInfo;
	  public CustomerDetails(int id, String name, String email, String phone, String city, String state, String country,
			String organization, String jobProfile, String additionalInfo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.country = country;
		this.organization = organization;
		this.jobProfile = jobProfile;
		this.additionalInfo = additionalInfo;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}
	public String getJobProfile() {
		return jobProfile;
	}
	public String getName() {
		return name;
	}
	public String getOrganization() {
		return organization;
	}
	public String getPhone() {
		return phone;
	}
	public String getState() {
		return state;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setState(String state) {
		this.state = state;
	}
}
