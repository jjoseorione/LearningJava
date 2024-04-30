//En java las cadenas son objetos de la clase String
import java.util.Scanner;

public class CadenaDeCaracteres{
	public static void main(String[] arg){
		int edad1, edad2;
		String nombre1, nombre2;
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.print("Nombre de la primera persona: ");
		nombre1 = teclado.next();
		System.out.print("Edad de " + nombre1 + ": ");
		edad1 = teclado.nextInt();
		System.out.println();
		System.out.print("Nombre de la segunda persona: ");
		nombre2 = teclado.next();
		System.out.print("Edad de " + nombre2 + ": ");
		edad2 = teclado.nextInt();
		System.out.println();
		if (edad1 > edad2)
			System.out.print(nombre1 + " es mayor con " + edad1 + " años.");
		else if(edad2 > edad1)
			System.out.print(nombre2 + " es mayor con " + edad2 + " años.");
		else
			System.out.print(nombre1 + " y " + nombre2 + " tienen la misma edad con " + edad1 + " años.");
	}
}