package com.jancy.test;

public class ForLoop2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int k=5-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
       
	}

}
