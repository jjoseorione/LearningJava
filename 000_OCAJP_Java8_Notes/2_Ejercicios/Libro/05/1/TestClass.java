package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		String str = "7" + 5 + 10;		//7510
		String str1 = 7 + 5 + "10";		//1210
		String str2 = "7" + (5 + 10);	//715

		int m = 50;						//50
		int n = ++m;					//m = 51, n = 51
		int o = m--;					//o = 51, m = 50
		int p = --o + m--;				//o = 50, m = 49, p = 100
		int x = m<n?n<o?o<p?p:o:n:m;	//m<n?n<o?(o<p?p:o):n:m
										//m<n?(n<o?100:n):m
										//m<n?51:m
										//x = 51

		int k = 4;
		boolean flag = k++ == 5;		//k = 5, flag = false
		flag = !flag;					//flag = true

		System.out.println("str: " + str);	//7510
		System.out.println("str1: " + str1);//1210
		System.out.println("str2: " + str2);//715
		System.out.println("m: " + m);		//49
		System.out.println("n: " + n);		//51
		System.out.println("o: " + o);		//50
		System.out.println("p: " + p);		//100
		System.out.println("x: " + x);		//51
		System.out.println("k: " + k);		//5
		System.out.println("flag: " + flag);//true
	}
}