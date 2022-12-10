package com.java;

public final class Test extends KeyWordsConcepts {
	
	
	int a = 30;
	
	public final void getTest() {
     final int a = 10;
     System.out.println(a);
     System.out.println(this.a);
     System.out.println(super.a);
     
	}
	
	
  public static void main(String[] args) {
	Test t = new Test();
	t.getTest();
}
}
