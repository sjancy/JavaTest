package com.jancy.test;

public class JavaTest {
	
	static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		int a=6;
		int b=5;
		int addtwonumber=add(a,b);
		System.out.println("The result is:" +addtwonumber);
	}
}
