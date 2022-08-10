package week1.day2;

import java.util.Scanner;

public class PosToNeg {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner Pn=new Scanner(System.in);
		
		System.out.println("Enter a number");
	    number=Pn.nextInt();
	    
	    if(number>0 || number<0 )
	     number=-(number);
	   
	    else
	    	
	   number=-(number);
	   System.out.println(number);
	}
	
}
