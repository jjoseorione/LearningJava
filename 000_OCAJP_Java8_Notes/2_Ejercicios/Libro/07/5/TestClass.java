package com.jjoseorione.test;
import java.util.Scanner;

public class TestClass{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String palabra = teclado.nextLine();
		for(int i = 0; i < palabra.length(); i++){
			if(palabra.charAt(i) == 'x' || palabra.charAt(i) == 'X'){
				for(int j = 0; j < i; j++)
					System.out.print(" ");
				System.out.println("^");
				System.out.println("Equis encontrada en posicion " + (i+1));
				break;
			}
		}
	}
}