/*Ingresaremos una cadena en lugar de un entero para provocar un error
Al ingresar una cadena se genera un java.util.InputMismatchException*/
import java.util.Scanner;

public class Cuadrado1{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.print("\n\tn: ");
		n = teclado.nextInt();
		n *= n;
		System.out.print("\n\tn^2: " + n);
	}
}