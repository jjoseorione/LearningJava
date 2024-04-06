package com.jjoseorione.letters;

import java.util.Scanner;
import java.io.*;

public class TestClass{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		args = new String[]{ null , "abcdefghijklmmes", "lkmejnveifjvnexx", "alkmc"};
		for(String palabra : args){
			try{
				char[] chars = palabra.toCharArray();
				System.out.println(cuentaVocales(chars));
			}
			catch(IOException e1){
				System.out.println("La cadena " + palabra + " contiene x");
			}
			catch(NullPointerException e2){
				System.out.println("-1");
			}
			catch(IndexOutOfBoundsException e3){
				System.out.println("0");
			}
		}
	}

	public static int cuentaVocales(char... letras) throws IOException{
		int numVocales = 0;
		char c = letras[10];
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