package test;

import animals.Bird;

public class TestClass{
	public static Bird bs = new Bird();
	public Bird b1 = new Bird();

	public static void main(String[] args){

		Bird b1 = new Bird();
		System.out.println(b1.fly(2.6f));	//Compilará debido a que se envía float,
											//se empaca hacia Float, dentro
											//del método se desempaca nuevamente y se
											//convierte en int para ser retornado
		System.out.println(b1.fly(Float.valueOf(3.8f)));		//Compila
		//System.out.println(b1.fly(3.8));	//No compila debido a que un double no cabe en un float
		//System.out.println(b1.fly(17));		//No compila debido a que int no puede convertirse en Float
		//System.out.println(b1.fly(new Integer(18)));	//No compila
		//System.out.println(b1.fly("3.8"));	//No compila


	}
}