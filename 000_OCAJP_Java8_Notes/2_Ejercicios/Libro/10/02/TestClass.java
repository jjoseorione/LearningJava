package com.jjoseorione.letters;

import java.util.Scanner;
import java.lang.Exception;

public class TestClass{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws VowelDetectedException{
		for(String palabra : args){
			char[] chars = palabra.toCharArray();
			System.out.println(cuentaVocales(chars));
		}
	}

	public static int cuentaVocales(char... letras) throws VowelDetectedException{
		int numVocales = 0;
		for(char letra : letras){
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
			letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
				numVocales++;
			else if(letra == 'x' || letra == 'X')
				throw new VowelDetectedException("Se introdujo una x");
		}
		return numVocales;
	}
}

class VowelDetectedException extends Exception{
	public VowelDetectedException(String msg){
		super(msg);
	}
}