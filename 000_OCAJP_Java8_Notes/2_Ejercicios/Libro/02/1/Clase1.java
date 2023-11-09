package paquete1;

import java.util.Scanner;

public class Clase1{
	int campo1 = 1;
	double campo2 = 2.2;
	float campo3 = 3.3F;
	static long campo4 = 4.4L;
	static char campo5 = '5';
	static String campo6 = "Seis";

	public void metodo1(){
		System.out.println("Metodo 1");
	}

	public void metodo2(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el numero 2: ");
		if(teclado.nextInt() == 2)
			System.out.println("Metodo 2");
		else
			System.out.println("Fail");
	}

	public static void metodo3(int tres){
		if(tres == 3)
			System.out.println("Metodo 3");
		else
			System.out.println("Fail");
	}
}