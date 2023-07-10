package com.cg.daytwo;

public class Operationclass {

	public static void main(String[] args) {
		int a=75,b=35;
		float c;
		
		c = a+b;
		System.out.println("added value :"+c);
		
		c = a-b;
		System.out.println("subtracted value:"+c);
		
		c = a*b;
		System.out.println("multiplied value:"+c);
		
		c = a/b;
		System.out.println("divided value :"+c);
		
		c = a%b;
		System.out.println("modulus value :"+c);
		
		
		
		System.out.println();
		
		
		//Logical Operator(&&, ||, !)
		//Relational Operator(<,<=,>,>=,==,!=)
		if (a == b && b == c && a == c) {
			System.out.println("All Values are Equal.");
		}
		else if (a == b || b == c || a == c) {
			System.out.println("Two of the Values are Equal.");
		}
		else if(a > b  &&  a > c) {
			System.out.println("A is the Greatest Number.");
		}
		else if (b > c) {
			System.out.println("B is the Greatest Number.");
		}
		else {
			System.out.println("C is the Grestest Number.");
		}
		
		

	}

}

	


