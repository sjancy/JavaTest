package com.jancy.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number:");
    int number=sc.nextInt();
    
    int factorial=0;
    int result=1;
    for(int i=1;i<number;i++) {

    	factorial=result*(i+1);
    	result=factorial;
      
    	
    }
    System.out.println("The Factorial is:" +result);
	}

}
