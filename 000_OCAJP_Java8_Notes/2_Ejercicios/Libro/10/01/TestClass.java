package com.jjoseorione.letters;

import java.util.Scanner;
import java.io.*;

public class TestClass{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		System.out.println("Introduce vocales: ");
		System.out.println("Hay " + cuentaVocales(creaArray()) + " vocales.");
	}

	public static int cuentaVocales(char... letras) throws IOException{
		int numVocales = 0;
		for(char letra : letras){
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
			letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
				numVocales++;
			else if(letra == 'x' || letra == 'X')
				throw new IOException("Se introdujo una x");
		}
		return numVocales;
	}

	private static char[] creaArray(){
		String entrada = teclado.nextLine();
		char[] arCh = new char[entrada.length()];
		for(int i = 0; i <entrada.length(); i++)
			arCh[i] = entrada.charAt(i);
		return arCh;
	}
}