package com.jjoseorione.test;
import java.util.Scanner;

public class TestClass{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un numero entero:");
		int num = teclado.nextInt();
		boolean primo = true;
		for(int i = 2; i <= num / 2; i++){
			if(num % i == 0){
				primo = false;
				//break;
				System.out.println("Numero divisible entre " + i);
			}
		}
		if(num == 1)
			primo = false;
		if(primo)
			System.out.println("El número es primo");
		else
			System.out.println("El numero no es primo");
	}
}