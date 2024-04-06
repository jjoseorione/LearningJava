package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int[] num = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		int[] mun = new int[num.length];
		for(int i = 0; i < num.length; i++)
			mun[num.length - 1 - i] = num[i];

		System.out.println("{");	
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] + "\t");
		System.out.println("\n}");
		System.out.println("{");	
		for(int i = 0; i < mun.length; i++)
			System.out.print(mun[i] + "\t");
		System.out.println("\n}");	

	}
}