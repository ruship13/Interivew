package com.prowing;


 public class Test implements I,J{

	 public static void main(String[] args) {
		Test t = new Test ();
		 t.m1(1);
		 t.m2(2);
	}

	@Override
	public void m1(int i) {
		System.out.println("abcd");
		
	}
	public void m2(int i) {
		System.out.println("hfgyd");
		
	}
	
}



	


