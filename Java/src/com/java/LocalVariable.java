package com.java;

public class LocalVariable {
	
	static int a = 10;//class variable
	
	
	
	
   public static void local() {//local variable(method level static will be used)
		
		int i = 40;//LV static will not be used
		System.out.println(i);
		System.out.println(a);

	}
   
   static {
	   
	   System.out.println("ANU");
   }
   
	public static void main(String[] args) {
		
		System.out.println(a);
		local();
		
	}

}
