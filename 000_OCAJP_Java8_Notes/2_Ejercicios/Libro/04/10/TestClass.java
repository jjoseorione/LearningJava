package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		Object aO[] = new Object[3];
		aO[0] = new int[2];
		aO[1] = new int[2][3];
		aO[2] = new String[3][2];
		aO[0][0][0] = "Hola desde el elemento 0 0 0";
		aO[1][2][1] = "Hola desde el elemento 1 2 1";

	}
}