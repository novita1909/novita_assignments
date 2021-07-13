package com.coreJavaAssignment2;


abstract class Employee
{
  double salary=10000;
  double incentives=1000; 
  double overtime=2000;
  abstract double totalSalary();
}

class Manager extends Employee
{
 
 double totalSalary()
  {
     return salary;
  }
}

class Labour extends Employee
{
  
 double totalSalary()
  {
   return salary;  
  }
}

public class EmployeeSalary
{
 public static void main(String args[])
  {
	int noOfDays=7;
    Employee emp=new Manager(); 
    double sal=emp.incentives+emp.totalSalary();
    System.out.println("Salary of manager is "+sal);
    
    Employee emp1=new Labour();
    double totalOvertime=noOfDays*emp1.overtime;
    double salr=totalOvertime+emp1.totalSalary();
    System.out.println("Salary of Labour is "+salr);

  
  }
}
