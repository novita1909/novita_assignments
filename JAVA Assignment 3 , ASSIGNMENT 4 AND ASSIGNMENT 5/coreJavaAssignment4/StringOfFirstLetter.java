package com.coreJavaAssignment4;

import java.util.Arrays;

public class StringOfFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder firstLetter=new StringBuilder();
		Arrays.asList("apple","mango","grapes","orange").forEach(o->firstLetter.append(o.charAt(0)));
		System.out.println(firstLetter);

	}

}
