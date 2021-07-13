package com.coreJavaAssignment1;

import java.util.Scanner;

public class ArmstrongNumberWithinRange {
	 public static void main(String args[])
	    {
		int num, i, rem, originalNumber, counter=0;
			
		

		//generate Armstrong numbers between start and end
		for(i=100+1; i<999; i++)
		{
		   originalNumber = i;
		   num = 0;
		   while(originalNumber != 0)
		   {
			rem = originalNumber%10;
			num = num + rem*rem*rem;
			originalNumber = originalNumber/10;
		   }
		   if(i == num)
		   {
			if(counter == 0)
			{
			   System.out.print("Armstrong Numbers Between "+100+" and "+999+": ");
			}
			   System.out.print(i + "  ");
			   counter++;
		   }
		}
		// if no Armstrong number is found
		if(counter == 0)
		{
		   System.out.print("There is no Armstrong number Between "+100+" and "+999);
		}
	    }
	}




