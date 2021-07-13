package com.coreJavaAssignment1;

import java.util.Scanner;

public class SIandCI {


	  public static void main(String[] args) {

	   Scanner input = new Scanner(System.in);
	    System.out.print("Enter the principal, rate and time: ");
	    double principal = input.nextDouble();
	    double rate = input.nextDouble();
	    double time = input.nextDouble();
	    
	    
	    double SimpleInterest = (principal * time * rate) / 100;
	    System.out.println("Simple Interest: "+SimpleInterest);
	    
	    
	    System.out.print("For compound interest---Enter number of times interest is compounded: ");
	    int number = input.nextInt();

	    double CompoundInterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
	    System.out.println("Compound Interest: " + CompoundInterest);

	    input.close();
	  }
	}
