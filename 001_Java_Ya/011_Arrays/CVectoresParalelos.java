/*Desarrollar un programa que permita cargar 5 nombres de personas y sus edades 
respectivas. Luego de realizar la carga por teclado de todos los datos imprimir 
los nombres de las personas mayores de edad (mayores o iguales a 18 años). Usar
un vector para nombres y otro para edades*/
import java.util.Scanner;

public class CVectoresParalelos{
	private int[] edades;
	private String[] nombres;
	private Scanner teclado = new Scanner(System.in);

	public void init(){
		System.out.println();
		System.out.print("Cantidad de datos a ingresar: ");
		int n = teclado.nextInt();
		nombres = new String[n];
		edades = new int[n];
		System.out.println();
		for(int i = 0; i < n; i++){
			System.out.print("\tNombre " + (i+1) + ": ");
			nombres[i] = teclado.next();
			System.out.print("\tEdad de " + nombres[i] + ": ");
			edades[i] = teclado.nextInt();
			System.out.println();
		}
		System.out.println("Datos ingresados correctamente.");
	}

	public void imprimir(){
		System.out.println();
		System.out.print("Datos ingresados:");
		System.out.println();
		for(int i = 0; i < nombres.length; i++){
			System.out.print("\t" + (i+1) + ". " + nombres[i] + ": " + edades[i]);
			System.out.println();
		}
	}

	public void mayorDeEdad(){
		System.out.println();
		System.out.println("Las siguientes personas son mayores de edad:");
		for(int i = 0; i < edades.length; i++){
			if(edades[i] >= 18)
				System.out.println(nombres[i] + " es mayor de edad");
		}
	}

	public static void main(String[] args){
		CVectoresParalelos vp1 = new CVectoresParalelos();
		vp1.init();
		vp1.imprimir();
		vp1.mayorDeEdad();
	}
}