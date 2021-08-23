package com.bridgelabz.javacoreprojects;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		  int year=1996;
		  int yearLength = (int) (Math.log10(year) + 1);
	      if(yearLength==4)
	      {
	    	  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	 	         System.out.println(" It is a leap year");
	 	      else
	 	         System.out.println("It is not a leap year");
	      }
	      else
	      {
	    	  System.out.println("Please enter a 4 digit number");
	      }

	}

}
