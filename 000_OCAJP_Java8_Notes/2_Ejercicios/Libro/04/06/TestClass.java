package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		String names[][] = new String[2][3];

		//Se necesitarán 6 Strings para llenar names

		names[0][0] = "Primero";
		names[0][1] = "Segundo";
		names[0][2] = "Tercero";
		names[1][0] = "Cuarto";
		names[1][1] = "Quinto";
		names[1][2] = "Sexto";

		// System.out.println("Imprimiendo valores manualmente:");
		// System.out.println(names[0][0]);
		// System.out.println(names[0][1]);
		// System.out.println(names[0][2]);
		// System.out.println(names[1][0]);
		// System.out.println(names[1][1]);
		// System.out.println(names[1][2]);

		// System.out.println("\nImprimiendo valores con ciclos:");
		// for(int i = 0; i < names.length; i++)
		// 	for(int j = 0; j < names[i].length; j++)
		// 		System.out.println(names[i][j]);

		String names1[] = names[0];
		String names2[] = names[1];

		for (String name : names1)
			System.out.println("names1: " + name);

		for (String name : names2)
			System.out.println("names2: " + name);
	}
}