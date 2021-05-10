package com.capgemini.oops.part10.Collections;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greet g=new Greet(); error as interface cant b instantiated
		// Greet g =new Greet(){   }; error interface must b overridden
		
		
		Greet g =new Greet() {
			
			@Override
			public void wish() {
				// TODO Auto-generated method stub
				System.out.println("it my b day");
			}
		};
		
		g.wish();

	}

}

interface Greet{
	
void wish();
}
