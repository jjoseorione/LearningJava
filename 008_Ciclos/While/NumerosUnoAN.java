import java.util.Scanner;

public class NumerosUnoAN{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Hasta que numero deseas visualizar? R: ");
		int n = teclado.nextInt();
		int x = 1;
		while (x <= n){
			System.out.println(x);
			x++;
		}


	}
}