import java.util.Scanner;

public class SumaProducto{
	public static void main(String[] arg){
		float num1;
		float num2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el primer numero: ");
		num1 = teclado.nextFloat();
		System.out.print("Escribe el segundo numero: ");
		num2 = teclado.nextFloat();
		if (num1 > num2){
			float suma = num1 + num2;
			float diferencia = num1 - num2;
			System.out.print("La suma es ");
			System.out.print(suma);
			System.out.print(" y la diferencia es ");
			System.out.print(diferencia);
		}
		else if(num1 < num2){
			float producto = num1 * num2;
			float cociente = num1 / num2;
			System.out.print("El producto es ");
			System.out.print(producto);
			System.out.print(" y el cociente es ");
			System.out.print(cociente);
		}
		else
			System.out.print("Los numeros son iguales");
	}
}