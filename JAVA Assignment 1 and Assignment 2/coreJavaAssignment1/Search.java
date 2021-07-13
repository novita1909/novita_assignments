package com.coreJavaAssignment1;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int numbers[]=new int[15];
		int numberSearched,temp=0,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int j=0;j<15;j++)
		{
			numbers[j]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		numberSearched=sc.nextInt();
		
		for(i=0;i<numbers.length;i++)
		{
			if(numbers[i]==numberSearched)
			{
				temp=1;
				break;
			}
		}
		
		if(temp==1)
		{
			System.out.println("Element found at position "+(i+1));
		}
		else
		{
			System.out.println("Element not found");
		}
		
		

	}

}
