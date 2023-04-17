import java.util.Scanner;

public class TablasPositivas{
	public void tablas(){
		Scanner teclado = new Scanner(System.in);
		int base;
		int cuadrado;

		System.out.print("\nEscriba un número entero: ");
		base = teclado.nextInt();

		while (base >= 0){
			imprimeTablas(base);
			cuadrado = devuelveCuadrado(base);
			System.out.println("El cuadrado es " + cuadrado);
			System.out.print("\nEscriba un número entero: ");
			base = teclado.nextInt();
		}
		
		System.out.println("\n ***FIN*** ");
	}

	public void imprimeTablas(int b){
		int i;
		for (i = 1; i <= 10; i++)
			System.out.println(b + " * " + i + " = " + (b*i));
	}

	public int devuelveCuadrado(int b){
		int cuad = b*b;
		return cuad;
	}

	public static void main(String[] arg){
		TablasPositivas tabla = new TablasPositivas();
		tabla.tablas();
	}
}