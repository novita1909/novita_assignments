package com.coreJavaAssignment2;


abstract class Bank
{
	double fixeddeposits=10000;
	double cashCredit=6000;
	abstract double totalCash();
}

class SavingAccountHolder extends Bank
{

	@Override
	double totalCash() {
		// TODO Auto-generated method stub
		return fixeddeposits;
	}
	
}

class CurrentAccountHolder extends Bank
{

	@Override
	double totalCash() {
		// TODO Auto-generated method stub
		return cashCredit;
	}
	
}
public class TotalAmount 
{
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  Bank bank=new SavingAccountHolder();
	
	  
	  double A,r,n,t;
      double temp;
      r = 0.05;
      t=2;
      n=4;
      temp=(1+r/n);
      
      //formula for calculating fixed deposit amount
      
      A=bank.fixeddeposits*Math.pow(temp,(n*t));
      double amount= Math.round(A);
      System.out.println("Fixed deposit: "+ amount);
     
	  Bank bank1=new CurrentAccountHolder();
	  double amount1=bank1.cashCredit;
	  
	  System.out.println("Total "+amount+amount1);
	}

}
