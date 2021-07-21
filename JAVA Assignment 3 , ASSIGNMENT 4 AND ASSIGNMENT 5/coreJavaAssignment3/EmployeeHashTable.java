package com.coreJavaAssignment3;

import java.util.Hashtable;

public class EmployeeHashTable {
	public static void main(String args[])
	{
		Hashtable<Employee,String> hashValue =new Hashtable<Employee,String>();
		Employee  e1=new Employee("Novita",50000);
		Employee  e2=new Employee("Sharma",40000);
		Employee  e3=new Employee("Ankit",30000);
		
		
		hashValue.put(e1, "Hey");
		System.out.println(hashValue.get(e1));
		System.out.println(e1.hashCode());
		System.out.println(e1.equals(e2));
		
		hashValue.put(e2, "Hi");
		System.out.println(hashValue.get(e2));
		System.out.println(e2.hashCode());
		System.out.println(e2.equals(e3));
		
		hashValue.put(e3, "Hellow");
		System.out.println(hashValue.get(e3));
		System.out.println(e3.hashCode());
		System.out.println(e3.equals(e1));

	}

}
