package com.coreJavaAssignment4;

import java.util.Arrays;
import java.util.List;

public class OrderStatus {
	public static void main(String[] args) 
	{
		List<Orders> list=Arrays.asList(new Orders(20000,"Accepted"),
				new Orders(1000,"Completed"),
				new Orders(2900,"Accepted"),
						new Orders(11000,"Completed"));
		
		list.stream()
		.filter(p->p.getPrice()>1000 && p.getStatus().equalsIgnoreCase("Accepted")|| p.getStatus().equalsIgnoreCase("Completed"))
		.forEach(System.out::println);
	}

}
