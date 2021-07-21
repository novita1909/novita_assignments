package com.coreJavaAssignment3;

import java.util.*;

public class BankAccountList {

	public static void main(String[] args) {
		
	
		SavingAccount sa=new SavingAccount(10000.90,109,"Ankit",true);
		SavingAccount sa1=new SavingAccount(20000,102,"Novita",true);
		SavingAccount sa2=new SavingAccount(1000,107,"Honey",true);
		SavingAccount sa3=new SavingAccount(1000,107,"Honey",true);
		TreeSet t=new TreeSet();
		t.add(sa);
		t.add(sa1);
		t.add(sa2);
		
		System.out.println(t);
	}

}
