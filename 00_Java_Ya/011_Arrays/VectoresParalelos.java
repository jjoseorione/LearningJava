/*Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas. 
Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas
mayores de edad (mayores o iguales a 18 años)*/
import java.util.Scanner;

public class VectoresParalelos{
	private Scanner teclado;
	private String[] nombres;
	private int[] edades;

	public void cargar(){
		teclado = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];
		System.out.println("Carga de valores\n");
		for (int i = 0; i < nombres.length; i++){
			System.out.print("\n\tIngrese el nombre " + (i+1) + ": ");
			nombres[i] = teclado.next();
			System.out.print("\n\tIngrese la edad de " + nombres[i] + ": ");
			edades[i] = teclado.nextInt();
			System.out.print("\n");
		}

		System.out.println("Carga finalizada.");
	}

	public void imprimir(){
		System.out.print("\n\nLos valores cargados son los siguientes.\n");
		System.out.print("| Nombre\t\t\t| Edad\t\t\t|");
		for (int i = 0; i < nombres.length; i++)
			System.out.print("\n| " + nombres[i] + "\t\t\t| " + "| " + edades[i] + "\t\t\t| ");
	}
	public static void main(String[] args){
		VectoresParalelos vc = new VectoresParalelos();
		vc.cargar();
		vc.imprimir();
	}
}