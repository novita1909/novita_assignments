package springcore;

public class Address {
private String street;
private String city;
private int zip;
private String state;
private String country;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
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
public Address(String street, String city, int zip, String state, String country) {
	super();
	this.street = street;
	this.city = city;
	this.zip = zip;
	this.state = state;
	this.country = country;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", zip=" + zip + ", state=" + state + ", country=" + country
			+ "]";
}




}
