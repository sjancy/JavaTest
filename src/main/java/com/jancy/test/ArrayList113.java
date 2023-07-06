package com.jancy.test;

import java.util.ArrayList;

public class ArrayList113 {

	public static void main(String[] args) {
	
		
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		s.name="Jancy";
		s1.name="Jerin";
		s2.name="Janice";
		s3.name="Jonathan";
		s4.name="Sam";
		
		System.out.println("Student:" +s.name);

		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(Student ss:al) {
			System.out.println("Name of the Student:" +ss.name);
		}
		
		for(int i=0;i<al.size();i++) {
			Student ss=al.get(i);
			System.out.println("Student:"+ss.name);
		}
		
		
		//String x = "Jancy";
		/*
		 * String x= new String("Jancy"); ArrayList<String> al1=new ArrayList<String>();
		 * al1.add(x); al1.add("Jancy");
		 */
		
		
		//Ball b1 = new Ball();//red, 5 cm
		//Ball b2 = new Ball();// green, 3 cm
		
	
	}

}
