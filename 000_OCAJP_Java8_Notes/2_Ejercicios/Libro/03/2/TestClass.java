package test;

import animals.Bird;

public class TestClass{
	public static Bird bs = new Bird();

	public static void main(String[] args){
		System.out.println("numBirds: " + bs.numBirds);		//Imprime 0 debido a que es numérica
		System.out.println("height: " + bs.height);			//Imprime 0.0 debido a que es numérica
		System.out.println("weight: " + bs.weight);			//Imprime 0.0 debido a que es numérica
		System.out.println("exotic: " + bs.exotic);			//Imprime 0 debido a que es numérica
		System.out.println("name: " + bs.name);				//Imprime null debido a que es referenciada
		System.out.println("doble: " + bs.doble);			//Imprime 0.0 debido a que es numérica
		System.out.println();
		System.out.println("bs: " + bs);					//Imprime animals.Bird@...
	}
}