package com.jjoseorione.test;
import java.util.Scanner;

public class TestClass{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un numero entero: ");
		int n = teclado.nextInt();
		System.out.println("Los numeros primos desde 2 hasta " + n + " son:");
		for(int i = 2; i <= n; i++){
			boolean primo = true;
			CICLO_2:
			for(int j = 2; j <= i / 2; j++){
				if(i % j == 0){
					primo = false;
					break CICLO_2;
				}
			}
			if(primo)
				System.out.println(i);
		}
	}
}