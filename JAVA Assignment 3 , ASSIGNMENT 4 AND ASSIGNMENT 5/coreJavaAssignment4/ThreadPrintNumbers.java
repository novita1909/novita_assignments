package com.coreJavaAssignment4;

import java.util.Arrays;

public class ThreadPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(()-> Arrays.asList(30,31,32,33,34,35,36,37,38,39).forEach(System.out::println)).run();

	}

}
