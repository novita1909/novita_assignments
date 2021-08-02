package com.example.assignment2;

public class zipInfo {
	int zip;
	String city;
	String state;
	String country;
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public zipInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public zipInfo(int zip, String city, String state, String country) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "zipInfo [zip=" + zip + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
