package com.prowing;

public class Palindrome_Number {

	public static void main(String[] args) {
		int i=121;
System.out.println(checkPalindrome(i));
	}

	public static boolean checkPalindrome(int i){
			
			String s=String.valueOf(i);
					StringBuffer reversed =new StringBuffer(s);
					reversed.reverse();
					
					String s1= new String(reversed);
			
			if( s.equals(s1)) {
				return true;
			}
			else return false;
		}
}
