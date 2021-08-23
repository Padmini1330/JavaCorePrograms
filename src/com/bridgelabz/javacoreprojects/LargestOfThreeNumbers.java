package com.bridgelabz.javacoreprojects;

public class LargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int number1=6, number2=7, number3=10;
		int largest = number3 > (number1 > number2 ? number1 : number2) ? number3 : ((number1 > number2) ? number1 : number2);
		System.out.println("Largest of three numbers is "+largest);

	}

}
