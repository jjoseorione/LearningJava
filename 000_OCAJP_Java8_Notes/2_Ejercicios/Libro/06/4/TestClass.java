package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int a = 0, b = 0, c = 10, d = 11;
		boolean flag = false;
		if (a == b)
			if (c == 10){
				if (d > a){ 
					System.out.println("menos uno");
				}
				else {
					System.out.println("cero");
				}
				if (flag)
					System.out.println("uno");
				else
					System.out.println("dos");
			}
			else if (flag == false)
				System.out.println("tres");
			else if (a + b < d)
				System.out.println("cuatro");
			else
				System.out.println("cinco");
		else 
			d = b;

		System.out.println("d = " + d);

		/*Salida esperada: 
			menos uno
			dos
			d = 0
		*/
	}
}