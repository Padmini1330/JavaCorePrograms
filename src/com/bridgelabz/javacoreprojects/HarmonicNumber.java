package com.bridgelabz.javacoreprojects;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		int n=7;
		if(n==0)
		{
			System.out.println("Enter the value greater than 0");
		}
		else
		{	
			float harmonicValue = 1;
			for (int i = 2; i <= n; i++) 
			{
				harmonicValue += (float)1 / i;
			}
			System.out.println(n+"th Harmonic number is "+harmonicValue);
		} 
		

	}

}
