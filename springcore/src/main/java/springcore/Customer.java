package springcore;

public class Customer {
private int customerId; 
private String CustomerName;
private int customerContact;
private Address customerAddress;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public int getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}
public Address getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	this.customerAddress = customerAddress;
}
public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
	super();
	this.customerId = customerId;
	CustomerName = customerName;
	this.customerContact = customerContact;
	this.customerAddress = customerAddress;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", CustomerName=" + CustomerName + ", customerContact="
			+ customerContact + ", customerAddress=" + customerAddress + "]";
}




}
