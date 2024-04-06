package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		byte b = 1;		//Compila
		//b = b << 1;		//No compila. El resultado es int debido a promoción numérica
		int c = b<<1;	//Compila. c = 2
		//byte d += b;	//No compila por combinar declaración y asignación compuesta
		byte e = 0;		//Compila, e = 0
		e += b;			//Compila debido al cast implícito e = 1

		System.out.println("b: " + b);		//1
		System.out.println("c: " + c);		//2
		System.out.println("e: " + e);		//1

	}
}