package com.bridgelabz.javacoreprojects;

public class Factors {
	public static void main(String[] args) 
	{
		int number=100;
		System.out.println("Prime factors of " + number + " are:");
		int i=2;
		while((i*i)<=number) 
		{
			if(number%i == 0) 
			{
				int c=0;
				for(int j=2;j<=Math.sqrt(i);j++) 
				{
					if((i%j)==0)
					{
						c++;	
					}
			     }
				if(c==0)
				{
					System.out.println(i);
				}
					
			}
			i++;
		}
	}

}
