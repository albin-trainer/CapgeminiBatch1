package com.capgemini.oops.part10.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//   harshset doesnt print duplicate data and theelements are also not in ordered
		HashSet<String> s1= new HashSet<String>();
		s1.add("Shirt");
		boolean b1=s1.add("Jeans");
		s1.add("T-shirt");
		boolean b2=s1.add("Jeans");
	   
		System.out.println(b1+"  "+b2);
		System.out.println(s1);
		
		// tree set also doesn not permit duplicate data but 
		//the elements are sorted in the ascending order (Ascii vale)
		TreeSet<String> s2=new TreeSet<String>();
		s2.add("Mango");
		boolean b3=s2.add("Apple");
		s2.add("Grapes");
		s2.add("Water-melon");
		boolean b4= s2.add("Apple");
		System.out.println(b3+" "+b4);
		System.out.println(s2);
		
		//linked harshset also dont permit duplicate data 
		// data are sorted i9n the insertion order
		LinkedHashSet<String> s3=new LinkedHashSet<String>();
		s3.add("football");
		s3.add("cricket");
		System.out.println(s3);
		
		
		
		

	}

}
