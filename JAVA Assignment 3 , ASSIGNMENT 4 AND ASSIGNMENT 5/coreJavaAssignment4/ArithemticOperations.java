package com.coreJavaAssignment4;


public class ArithemticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AritmeticOperations add=(int a,int b)->a+b;
		System.out.println("Addition : "+add.operations(10, 20) );
		
		AritmeticOperations subtract=(int a,int b)->a-b;
		System.out.println("Subtraction: "+subtract.operations(20, 10) );
		
		AritmeticOperations multiply=(int a,int b)->a*b;
		System.out.println("Multiplication : "+multiply.operations(10, 20) );
		
		AritmeticOperations divide=(int a,int b)->{
			if(b==0)
			return 0;
			else
			return a/b;
		};
		System.out.println("Division : "+divide.operations(100, 20) );
		
		
	}
	
	@FunctionalInterface
	interface AritmeticOperations
	{
		int operations(int a,int b);
	}

}
