package test;

import animals.Bird;

public class TestClass{
	public static Bird bs = new Bird();
	public Bird b1 = new Bird();

	public static void main(String[] args){

		Bird b1 = new Bird();
		b1.b1 = new Bird();

		//No entendí el punto del pinche ejercicio :(
		//Si es lo que creo, al finalizar el método main, deben morir un total de 2 objetos Bird
		//que son los que se crean en el Main. Los que forman parte de TestClass no se eliminan
		//debido a que jamás son creados, pues nunca se crea un objeto TestClass.
	}
}