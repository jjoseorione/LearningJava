/* Creamos el mismo programa que en Cuadrado2 pero usando try/catch */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.print("\n\tn: ");
		try{
			n = teclado.nextInt();
			n *= n;
			System.out.print("\n\tn^2: " + n);
		}
		catch(InputMismatchException e){
			System.out.print("Debe ingesar un numero entero\n\n" + e);
		}

		
		
	}
}