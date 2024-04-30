package com.jjoseorione.letters;

import java.util.Scanner;
import java.lang.Exception;

public class TestClass{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		args[0] = null;
		for(String palabra : args){
			char[] chars;
			if(palabra == null)
				chars = null;
			else  
				chars = palabra.toCharArray();
			try{
				System.out.println(cuentaVocales(chars));
			}
			catch(VowelDetectedException e1){
				System.out.println("La cadena " + palabra + " contiene x");
			}
			catch(IllegalArgumentException e2){
				System.out.println(e2.getMessage);
			}
		}
	}

	public static int cuentaVocales(char... letras) throws VowelDetectedException{
		if(letras == null)
			throw new IllegalArgumentException("El argumento no puede ser null");
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