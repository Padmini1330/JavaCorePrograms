package com.bridgelabz.javacoreprojects;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		int numberOfFlips=20;
		int headsCount=0;
		for(int index=0;index<numberOfFlips;index++)
		{
			if(numberOfFlips<=0)
			{
				System.out.println("Number of flips should be a positive integer");
			}
			else
			{
				if(Math.random()>0.5)
				{
					headsCount++;
				}
			}
		}
		int headsPercentage=(headsCount*100)/numberOfFlips;
		int tailsPercentage=100-headsPercentage;
		System.out.println("Heads Percentage="+headsPercentage);
		System.out.println("Tails Percentage="+tailsPercentage);
		

	}
	

}
