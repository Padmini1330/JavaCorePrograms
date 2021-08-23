package com.bridgelabz.javacoreprojects;

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		for (int index=0; index<=n; index++)
		{
			System.out.println((int)Math.pow(2,index));
			
		}

	}

}
