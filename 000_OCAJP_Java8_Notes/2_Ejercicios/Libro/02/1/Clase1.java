package paquete1;

import java.util.Scanner;

public class Clase1{
	public int campo1 = 1;
	public double campo2 = 2.2;
	public float campo3 = 3.3F;
	public static long campo4 = 4L;
	public static char campo5 = '5';
	public static String campo6 = "Seis";

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