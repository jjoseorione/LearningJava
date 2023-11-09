public class PruebaPosPreIncremento2{
	public static void main(String[] args){
		int a = 2;
		int b = 5;
		int c = a * (a++ - --b) * a * b;		//Se sustituye por c = 2 * (2 - 4) * 3 * 4;
		System.out.println(a + " " + b + " " + c);	//Imprime 3 4 -48

		a = 2;
		b = 5;
		c = b * a * (a++ - --b) * a * b;		//Se sustituye por c = 5 * 2 * (2 - 4) * 3 * 4;
		System.out.println(a + " " + b + " " + c);	//Imprime 3 4 -240
	}
} 