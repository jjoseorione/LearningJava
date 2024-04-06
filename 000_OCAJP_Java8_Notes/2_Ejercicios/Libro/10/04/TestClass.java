package com.jjoseorione.letters;

import java.util.Scanner;
import java.io.*;

public class TestClass{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		for(String palabra : args){
			char[] chars = palabra.toCharArray();
			try{
				System.out.println(cuentaVocales(null));
			}
			catch(IOException e){
				System.out.println("La cadena " + palabra + " contiene x");
			}
		}
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
}