package test;

public class TestClass{
	public static void main(String[] args){
		int[] first = new int[3];
		int[] second = {};
		int[] third = null;

		System.out.println(first.length);		//3
		System.out.println(second.length);		//0
		//System.out.println(third.length);		//NullPointerException

		for( int element : first )
			System.out.println("first " + element);	//tres veces cero

		for( int element : second )
			System.out.println("second" + element);	//no se ejecuta

		for( int element : third )
			System.out.println("third" + element);	//NullPointerException
	}
}