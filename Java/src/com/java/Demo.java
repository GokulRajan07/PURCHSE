package com.java;

public class Demo {
	
	int p = 19;

	public static void test() {
   int b = 50;
   System.out.println(b);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.p);
		d.test();
		LocalVariable.local();//classname.methodname
	}
}
