package com.task3;

import java.util.Scanner;

public class BankAccount implements ATM
{
	double avail_amount=50000;
	public double depositAmount(double amount)
	{
	  avail_amount=avail_amount+amount;
	  return avail_amount;
	}
	public double withdrwalAmount(double amount)
	{
	  avail_amount=avail_amount-amount;
	  return avail_amount;
	}
	public double checkBalance()
	{
	  return avail_amount;	
	}
	
	public static void main(String[] args) 
	{
	  int opt;
	  boolean status=true;
	  
	  Scanner sc=new Scanner(System.in);
	  BankAccount bac=new BankAccount();
	  
	  double w_amt;
	  double d_amt;
	  
	  while(status)
	  {
		  System.out.println("Choose Any One Option from Below 1-4");
		  System.out.println("1. Deposit Amount");
		  System.out.println("2. Withdrwal Amount");
		  System.out.println("3. Check Balance");
		  System.out.println("4. Exit");
		  opt=sc.nextInt();
		  
	      switch(opt)
	      {
	        case 1:
	        	System.out.println("Enter Amount To Deposit:");
	        	d_amt=sc.nextDouble();
	            bac.depositAmount(d_amt);
	            System.out.println("Transaction Completed.");
	            System.out.println("Rs "+d_amt+" Deposited SuccessFully");
	    	    break;
	    	    
	        case 2:
	        	System.out.println("Enter Amount To Withdwal");
	        	w_amt=sc.nextDouble();
	            if(w_amt<bac.avail_amount)
	            {
	              bac.withdrwalAmount(w_amt);
	              System.out.println("Transaction Completed.");
	        	  System.out.println(w_amt+" Withdwal SuccessFully");
	            }
	            else
	            {
	              System.out.println("Transaction Failed! Enter Valid Amount"); 	
	            }
	    	    break;
	    	    
	        case 3:
	        	bac.checkBalance();
	        	System.out.println("Available Balance:"+bac.avail_amount);
	    	    break;
	    	    
	        case 4:
	        	System.out.println("Thank You For Using Application");
	        	status=false;
	        	break;
	        	
	        default:	        	  
	    	    System.out.println("Invalid Option Choosen! Kindly Enter Valid Option");
	    	
	      }
	  }
	  
	}
	

}
