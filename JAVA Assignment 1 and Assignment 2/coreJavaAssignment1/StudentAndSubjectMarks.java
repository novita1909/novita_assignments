package com.coreJavaAssignment1;


import java.util.Scanner;


public class StudentAndSubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int student[][]=new int[3][3];
		String sub[]= {"A", "B", "C"};
		
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter marks of student "+(i+1)+" for subjects A,B and C");
			for(int j=0;j<3;j++)
			{
				student[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\n");

        System.out.println("Total And Average score of each Student: ");

        for ( int i=0 ; i<3 ; i++ )
        {
            System.out.println("Student " + (i+1) + ": ");

            int total = 0;
            for ( int j=0 ; j<3 ; j++ )
            {

                total += student[i][j];

            }
            
            System.out.println("Total Score: " + total);
            System.out.println("Average Score: " + total/3 + "\n");
        }
        

        System.out.println("Enter subject for which you want to calculate average (0,1,2) ");
        int subjectCode=sc.nextInt();
        
        int marksSum = 0;
        for (int i = 0; i < 3; i++) {

          
            marksSum += student[i][subjectCode];
        }
        System.out.println("Average marks scored in "+subjectCode+" subject are "+(double)marksSum/student.length);

	}

}
