package test;

public class TestClass{
	public static void main(String[] args){
		char[] arChar = {'a', 'b', 'c', 'd'};
		{
			char aux = arChar[0];
			arChar[0] = arChar[1];
			arChar[1] = arChar[2];
			arChar[2] = arChar[3];
			arChar[3] = aux;
		}

		for (char caracter : arChar){
			System.out.println(caracter);
		}
		
	}
}