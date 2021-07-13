package com.coreJavaAssignment1;


import java.util.Scanner;

public class MarksOfStudents {
		public static void main(String[] args) 
		{
		 Scanner sc=new Scanner(System.in);
		 int marks[]=new int[3];
		 System.out.println("Enter the marks of three different subjects");
		 for(int i=0;i<3;i++)
		 {
			 marks[i]=sc.nextInt();
			 
		 }
		 
		 {	 
		  if(marks[0]>60 && marks[1]>60 && marks[2]>60)
		  {
			  System.out.println("Passed");
		  }
		  
		  else if((marks[0]>60 && marks[1]>60) || marks[2]>60)
		  {
			  System.out.println("Promoted");
		  }
		  
		  else if ((marks[0]>60 || marks[1]>60|| marks[2]>60 )||(marks[0]<60 && marks[1]<60 && marks[2]<60)) 
		  {
			  System.out.println("Failed");
		  }
		 
		}
	} 

}
