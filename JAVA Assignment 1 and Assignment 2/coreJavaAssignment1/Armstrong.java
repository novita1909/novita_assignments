package com.coreJavaAssignment1;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result =result+remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}