package com.coreJavaAssignment3;


import java.util.*;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question2 {

	public static void main(String args[])
		{
			
			Set<Integer> set=new HashSet<>();
			set.add(6);
			set.add(7);
			set.add(10);
			set.add(5);
			set.add(420);
			
			Iterator<Integer> itr=set.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next()); 
			  }
			  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
			  
			  Set<Integer> set2=new LinkedHashSet<>();
				set2.add(6);
				set2.add(7);
				set2.add(10);
				set2.add(5);
				set2.add(420);
				
				Iterator<Integer> itr1=set2.iterator();  
				  while(itr1.hasNext()){  
				   System.out.println(itr1.next()); 
				  }
		}


}