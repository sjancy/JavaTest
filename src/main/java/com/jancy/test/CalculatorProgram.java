package com.jancy.test;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Boolean x=true;
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
	
		System.out.println("Enter your option:");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4. Division");
		int number=sc.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("The addition of two numbers:" + (a+b));
		
		break;
	    case 2:
		    System.out.println("The substraction of two numbers:" + (a-b));
		    
		    break;
	    case 3:
		    System.out.println("The Multiplication of two numbers:" + (a*b));
		    
		    break;
	    case 4:
		    System.out.println("The suntraction of two numbers:" + (a/b));
	}
	
	}
	
}
