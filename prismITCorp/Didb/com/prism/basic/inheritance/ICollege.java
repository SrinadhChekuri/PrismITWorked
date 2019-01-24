package com.prism.basic.inheritance;

public class ICollege {
	//declare the common methods for all students
	private String collegeName="Campbellsville University";
	private String location="Jacksonville";
	private String State="florida";
	private String address="1-2-3-4 bolivard";
	
	
	
	//declaring the getters and setters
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
