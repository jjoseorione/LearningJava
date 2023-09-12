//Realizar un programa que permita el intercambio de valores entre dos variables.
//Por ejemplo: Si una variable num1 vale 35 y otra variable num2 vale 20,
//realizar las acciones necesarias para que num1 pase a valer 20 y num2 pase a
//valer 35. Mostrar  
import java.util.Scanner;

public class Intercambio{
	public static void main(String[] args){
		int num1, num2, aux;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el valor de num1: ");
		num1 = teclado.nextInt();
		System.out.println("Escribe el valor de num2: ");
		num2 = teclado.nextInt();
		System.out.println("Se intercambian los valores");
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("Ahora num1 vale: " + num1);
		System.out.println("Ahora num2 vale: " + num2);
	}
}