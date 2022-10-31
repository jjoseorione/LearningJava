import java.util.Scanner;

public class PerimetroCuadrado{
	public static void main(String[] arg){
		float lado;
		float perimetro;
		Scanner teclado = new Scanner(System.in); 
		System.out.println(" ***** PERIMETRO DE UN CUADRADO ***** ");
		System.out.print("Escriba la medida del lado: ");
		lado = teclado.nextFloat();
		perimetro = lado * 4;
		System.out.print("El perimetro es: ");
		System.out.print(perimetro);
	}
}