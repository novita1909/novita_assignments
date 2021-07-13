package com.coreJavaAssignment2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String role,item,addItem;
		int quantity;
		double CandyCost=0.0,CookieCost=0.0,IceCreamCost=0.0;
		
		System.out.println("What is your role? --(owner or customer)");
		role=sc.next();
		if(role.equals("owner"))
		{
			List<String> newItem=new ArrayList<>();
			System.out.println("No. of items to be added in list : ");
			int scan = sc.nextInt();
			for(int index = 0; index < scan; index++) {
				System.out.println("Add item to " + (index+1) + "th position : ");
				addItem=sc.next();
				newItem.add(addItem);
			}
			System.out.println(newItem);

			
		}
		else
		{	
			System.out.println("Enter the item you want to order (enter one item at a time) and how much?");
			item=sc.next();
			quantity=sc.nextInt();
			
			if(item.equals("Candy"))
			{
				Candy c=new Candy();
				CandyCost=c.getCost(quantity);
				System.out.println("Total Cost of Candy is "+CandyCost);
			}
			else if(item.equals("Cookie"))
			{
				Cookie co=new Cookie();
				CookieCost=co.getCost(quantity);
				System.out.println("Total Cost of Cookie is "+CookieCost);
			}
			else if(item.equals("IceCream"))
			{		
				IceCream ic=new IceCream();
				IceCreamCost=ic.getCost(quantity);
				System.out.println("Total Cost of IceCream is "+IceCreamCost);
			}
		
		}
	
	}

}
