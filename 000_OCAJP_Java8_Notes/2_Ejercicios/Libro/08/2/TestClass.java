package com.jjoseorione.test;
import java.util.Scanner;

public class TestClass{
	public static void main(String[] args){
		System.out.println("Escribe cualquier cantidad de números separados por espacio");
		int[] numeros = multiScanner(new Scanner(System.in).nextLine().split(" "));
		System.out.println("La suma es: " + add(numeros));
		System.out.println("La concatenacion es es: " + concat(numeros));

	}

	public static int add(int... valores){
		int resultado = 0;
		for(int v : valores)
			resultado+=v;
		return resultado;
	}

	public static String concat(int... valores){
		String resultado = "";
		for(int v : valores)
			resultado+=v;
		return resultado;
	}

	public static int[] multiScanner(String... cadenas){
		int[] valores = new int[cadenas.length];
		for(int i = 0; i < valores.length; i++ )
			valores[i] = Integer.parseInt(cadenas[i]);
		return valores;
	}

}