package com.task1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);	
	  Random r=new Random();
	  int guessno=r.nextInt(100);
	  int userno;
	  	  
	  int score=0;
	  int count=3;
	  while(count>0)
	  {
		  System.out.println("Guess A Number! You Have "+count+" Chances:");
		  userno=sc.nextInt();	  
	   if(userno==guessno)
	   {
		System.out.println("You Got Correct Number");
		score=score+5;
	   }
	   else
		   if(userno>guessno)
		   {
			System.out.println("Number is Too High");   
		   }
		   else
			   if(userno<guessno)
			   {
				System.out.println("Number is Low");   
			   }
			  
	   count--;
	   
	  }
	  
	   System.out.println("Your Score Is:"+score);
	   System.out.println(count+" Chance are Remains.");
	   System.out.println("Guess Number Is:"+guessno);
	   System.out.println("Thank You For Playing!");
	}

}
