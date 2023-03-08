package com.prowing;

public class Palindrome_String {

	public static void main(String[] args) {
	String s="madam";
	System.out.println(m(s));
	}

		public static boolean m(String s) {
			String s1="";
			for(int i=s.length()-1;i>=0;i--) {
				s1=s1+s.charAt(i);
				
			}if(s.equalsIgnoreCase(s1)) {
				return true;
			} 
			else return false;
		}
}
