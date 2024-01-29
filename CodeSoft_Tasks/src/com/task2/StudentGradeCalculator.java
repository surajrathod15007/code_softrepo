package com.task2;

import java.util.Scanner;

public class StudentGradeCalculator 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Marks Obtained By Student out of 100 in Following Subject");
    System.out.println("Java:");
    int j=sc.nextInt();
    System.out.println("Python:");
    int p=sc.nextInt();
    System.out.println("JavaScript:");
    int js=sc.nextInt();
    System.out.println("C++:");
    int cpp=sc.nextInt();
    System.out.println("C:");
    int c=sc.nextInt();
    
    int total_marks=j+p+js+cpp+c;
    float avg_perc=total_marks/5;
    String grade="";
    if(avg_perc>=90)
    {
      grade="A";	
    }
    else if(avg_perc>=80 && avg_perc<90)
    {
      grade="B";
    }
    else if(avg_perc>=70 && avg_perc<80)
    {
      grade="C";
    }
    else if(avg_perc>=60 && avg_perc<70)
    {
    	grade="D";
    }
    
    System.out.println("Student Result :");
    System.out.println("Total Marks Out Of 500:"+total_marks);
    System.out.println("Percentage:"+avg_perc);
    System.out.println("Grade:"+grade);
  }

}
