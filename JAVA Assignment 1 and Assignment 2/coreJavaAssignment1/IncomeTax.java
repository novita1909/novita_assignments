package com.coreJavaAssignment1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double tax=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double amount=sc.nextDouble();
		
		if(amount<=0)
		{
			System.out.println("Invalid amount");
		}
		else if(amount<=180000)
		{
			tax=0;
		}
		else if( amount<=300000)
		{
			tax=amount*0.1;
		}
		else if(amount<50000)
		{
			tax=amount*0.2;
		}
		else
		{
			tax=amount*0.3;
		}
		
		System.out.println("Tax to be paid is : "+tax);
	
	}

}
