package test;

import animals.Bird;

public class TestClass{

	public static void main(String[] args){

		Bird b1 = new Bird();

		//Se lanza un stackOverflowError debido a la recursividad infinita de objetos
		//de la clase Bird.
	}
}