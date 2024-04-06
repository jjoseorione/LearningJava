package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);

		if(num % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");

		System.out.println("El numero es " + (num%2==0 ? "par" : "impar"));

	}
}