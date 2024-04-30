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
											//convierte en int por medio de casting para ser retornado
		System.out.println(b1.fly(Float.valueOf(3.8f)));		//Compila debido a que se envía Float
																//dentro del método se desempaca a float
																//y se convierte a int con el casting
		//System.out.println(b1.fly(3.8));	//No compila debido a que double no puede ser convertido a Float
											//double puede convertirse a float por medio de casting y float a Float
											//por medio de autoboxing, pero no se está realizando cast
		//System.out.println(b1.fly(17));		//No compila debido a que int no puede convertirse en Float directamente.
											//int puede convertirse a float por medio de casting y float a Float por medio
											//de autoboxing
		//System.out.println(b1.fly(new Integer(18)));	//No compila por lo mismo que el anterior
		//System.out.println(b1.fly("3.8"));	//No compila


	}
}