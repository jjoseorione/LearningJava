package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int num = 0;
		try{
			num = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Ewe, tienes que invocar este programa con un parametro");
			System.exit(1);
		}
		catch(NumberFormatException e){
			System.out.println("Ewe, el parametro debe ser un numero entero");
			System.exit(1);
		}
		if( num % 30 == 0 )
			System.out.println("2, 3, 5");
		else if( num % 6 == 0 )
			System.out.println("2, 3");
		else if( num % 5 == 0 )
			System.out.println("5");
		else if( num % 3 == 0 )
			System.out.println("3");
		else if( num % 2 == 0 )
			System.out.println("2");
		else
			System.out.println("Desconocido");
	}
}