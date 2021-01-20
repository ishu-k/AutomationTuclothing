package testingpractise.practise;

import java.util.Scanner;

public class CheckingEvenorOdd 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter an integer number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
				
			if(num%2==0)
			{
				System.out.println("num is even number");
			}
			else
			{
				System.out.println("num is odd number");		
				
	        }

	 }
}

