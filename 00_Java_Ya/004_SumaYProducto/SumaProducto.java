import java.util.Scanner;

public class SumaProducto{
	public static void main(String[] arg){
		int num1;
		int num2;
		int suma;
		int prod;
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println(" ********** SUMA Y PRODUCTO DE DOS ENTEROS ********** ");
		System.out.println();
		System.out.print("Escriba el valor del primer entero: ");
		num1 = teclado.nextInt();
		System.out.print("Escriba el valor del segundo entero: ");
		num2 = teclado.nextInt();
		suma = num1 + num2;
		prod = num1 * num2;
		System.out.println();
		System.out.print("El valor de la suma es ");
		System.out.print(suma);
		System.out.println();
		System.out.print(" y el valor del producto es ");
		System.out.print(prod);
		System.out.println();
		System.out.println();
	}
}