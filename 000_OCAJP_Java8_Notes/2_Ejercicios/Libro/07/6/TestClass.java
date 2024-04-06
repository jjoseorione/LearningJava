package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		String[][] chars = new String[2][];
		chars[0] = new String[2];
		chars[1] = new String[4];
		char cha = 97;
		for(char c=0; c< chars.length; c++){
			for(char ch=0; ch<chars[c].length; ch++){
				chars[c][ch] = ""+cha;
				cha++;
			}
		}

		for(String[] aS : chars){
			for(String s : aS)
				System.out.print(s + "\t");
			System.out.println();
		}
	}
}