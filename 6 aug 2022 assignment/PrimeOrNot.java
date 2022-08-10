package week1.day2;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int num,i;
		boolean prime=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		num=s.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				 prime=false;
				 break;
			}
		}
			System.out.println(prime);
		
			if(prime==false)
				System.out.println("This is not a prime number");
			else
				System.out.println("This is a prime number");
	
			}
	          
		}
		
		
