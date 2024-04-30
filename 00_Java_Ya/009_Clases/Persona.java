/*Confeccionar una clase que permita carga el 
nombre y la edad de una persona. Mostrar los 
datos cargados. Imprimir un mensaje si es mayor 
de edad (edad>=18)*/
import java.util.Scanner;

public class Persona{
	private Scanner teclado;
	private String nombre;
	private int edad;

	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}

	public void imprimir(){
		System.out.print("Nombre: " + nombre + ". ");
		System.out.print("Edad: " + edad + ". ");
	}

	public void esMayorEdad(){
		if (edad >= 18)
			System.out.print(nombre + " es mayor de edad. ");
		else 
			System.out.print(nombre + " no es mayor de edad. ");
	}

	public static void main(String[] arg){
		Persona persona1 = new Persona();	//Se crea un objeto persona llamado persona1
		persona1.inicializar();				//Se llama al método inicializar del objeto persona1
		persona1.imprimir();				//Se llama al método imprimir del objeto persona1
		persona1.esMayorEdad();				//Se llama al método esMAyorEdad del objeto persona1
	}
}
