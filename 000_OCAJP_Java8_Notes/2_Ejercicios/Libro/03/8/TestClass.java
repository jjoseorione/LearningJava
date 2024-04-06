package test;

import animals.Bird;

public class TestClass{
	public static Bird bs = new Bird();
	public Bird b1 = new Bird();

	public static void main(String[] args){

		Bird b1 = new Bird();
		int i =  b1.fly(2.6f);			//Compila
		float f =  b1.fly(3.5f);			//Compila
		// String str = (String) b1.fly(4.2f);		//No compila
		// boolean bool = (boolean) b1.fly(5.99f);	//No compila

		System.out.println(i);
		System.out.println(f);
		// System.out.println(str);
		// System.out.println(bool);


	}
}