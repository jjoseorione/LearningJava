import java.util.Scanner;

public class PromedioDeNNumeros{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float prom = 0;
		int cont = 0;
		System.out.println("Promedio de N números. \nIngrese valor de N:");
		int n = teclado.nextInt();
		while (cont < n){
			System.out.print("\nEscriba el elemento " + (cont+1) + ": ");
			prom += teclado.nextInt();
			cont++;
		}
		prom = prom / n;
		System.out.print("\n\nEl promedio es " + prom);
	}
}