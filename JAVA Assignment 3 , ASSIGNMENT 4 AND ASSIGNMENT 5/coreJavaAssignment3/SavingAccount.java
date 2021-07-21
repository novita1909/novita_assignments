package com.coreJavaAssignment3;

public class SavingAccount implements Comparable {
	double acc_balance;
	int acc_id;
	String accHolderName;
	boolean isSalaryAccount;
	
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
   
	public double withdraw(double amount)
	{
		acc_balance=acc_balance-amount;
		return amount;
	}
	public double deposit(double amount)
	{
		acc_balance=acc_balance+amount;
		return amount;
	}
	public SavingAccount(double acc_balance, int acc_id, String accHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accHolderName = accHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	@Override
	public String toString() {
		return "[acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", accHolderName=" + accHolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "] \n";
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int accid=this.acc_id;
		SavingAccount sa=(SavingAccount)o;
		int accid1=sa.acc_id;
		if(accid<accid1)
			return -1;
		else if(accid>accid1)
			return 1;
		else 
			return 0;
		
	}
	
	

	
	
}
