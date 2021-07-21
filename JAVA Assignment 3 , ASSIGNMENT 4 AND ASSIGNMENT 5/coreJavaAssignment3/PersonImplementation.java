package com.coreJavaAssignment3;

import java.util.TreeSet;

public class PersonImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Novita",5.0,47.5);
		Person p1=new Person("Ankit",6.0,47.5);
		Person p2=new Person("Ravi",5.8,92);
		Person p4=new Person("Harshit",5.5,55);
		Person p5=new Person("Ankita",6.2,47.5);
		TreeSet t=new TreeSet();
		
		
		t.add(p);
		t.add(p1);
		t.add(p2);
		t.add(p4);
		t.add(p5);
		
		System.out.println(t);

	}

}
