package test;

public class TestClass{
	public static void main(String[] args){
		boolean[] ab = new boolean[3];
		for (boolean element : ab){
			System.out.println(element);		//Todos imprimirán false, debido a que es el
		}										//valor default
	}
}