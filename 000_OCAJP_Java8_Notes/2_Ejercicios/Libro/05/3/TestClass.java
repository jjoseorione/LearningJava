package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		String s = "a";
		String[] sa = { "a" , s , s.substring(0,1) , new String("a") , ""+'a' };
		for(int i = 0; i < sa.length; i++){
			System.out.println(i);
			System.out.println(s == sa[i]);
			System.out.println(s.equals(sa[i]));
		}

		/*	0
			true
			true
			1
			true
			true
			2
			true
			true
			3
			false
			true
			4
			true
			true
		*/
	}
}