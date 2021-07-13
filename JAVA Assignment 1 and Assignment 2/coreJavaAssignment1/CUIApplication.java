package com.coreJavaAssignment1;

import java.util.*;
public class CUIApplication {
	public static void main(String args[])
	{
		String valName="admin";
		String valPass="admin11";
		int count=3;
		
		
		while(count>0)
		{	
			String name,password;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Login name");
			name=sc.next();
			System.out.println("Enter password");
			password=sc.next();
			if(name.equals(valName) && password.equals(valPass))
				{
					System.out.println("Welcome "+valName);
					break;
				}
			else
			{
				count=count-1;
				
					if(count==0)
					{
						System.out.println("Contact admin");
						break;
					}
			}
		
		}
		
	}


}
