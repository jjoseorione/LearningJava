package test;

import animals.Bird;

public class TestClass{
	public static Bird bs = new Bird();
	public Bird b1 = new Bird();

	public static void main(String[] args){

		//Error debido a que una variable de instancia (b1) no puede ser referenciada
		//desde un contexto estático (el método main es estático). Se resuelve creando 
		//un objeto de la clase TestClass para que sea al que se le realicen cambios en
		//su atributo Bird.

		TestClass t1 = new TestClass();

		t1.b1.numBirds = 1;
		t1.b1.height = 2.5f;
		t1.b1.weight = 1.8f;
		t1.b1.exotic = true;
		t1.b1.name = "Loro cabeza de caracol";
		t1.b1.doble = 86.5;

		bs.numBirds = 2;
		bs.height = 2.3f;
		bs.weight = 4.8f;
		bs.exotic = false;
		bs.name = "Cenzontle";
		bs.doble = 32.7;

		System.out.println("t1.b1.numBirds: " + t1.b1.numBirds);
		System.out.println("t1.b1.height: " + t1.b1.height);	
		System.out.println("t1.b1.height: " + t1.b1.weight);	
		System.out.println("t1.b1.exotic: " + t1.b1.exotic);	
		System.out.println("t1.b1.name: " + t1.b1.name);
		System.out.println("t1.b1.doble: " + t1.b1.doble);	
		System.out.println();
		System.out.println("t1.b1: " + t1.b1);

		System.out.println("bs.numBirds: " + bs.numBirds);
		System.out.println("bs.height: " + bs.height);	
		System.out.println("bs.height: " + bs.weight);	
		System.out.println("bs.exotic: " + bs.exotic);	
		System.out.println("bs.name: " + bs.name);
		System.out.println("bs.doble: " + bs.doble);	
		System.out.println();
		System.out.println("bs: " + bs);
	}
}