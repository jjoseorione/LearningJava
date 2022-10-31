import java.util.Scanner;

public class NumerosUnoAN{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba el número hasta el que desea ver: ");
		int n = teclado.nextInt();
		for (int i=1; i <= n; i++)
			System.out.println(i);
	}
}