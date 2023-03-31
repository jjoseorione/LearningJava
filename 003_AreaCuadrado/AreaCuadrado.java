import java.util.Scanner;

public class AreaCuadrado{
	public static void main(String[] arg){
		float lado;
		float area;
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.println("************ AREA DE UN CUADRADO ************");
		System.out.println();
		System.out.print("Escriba la medida del lado del cuadrado: ");
		lado = teclado.nextFloat();
		area = lado * lado;
		System.out.println();
		System.out.print("El area del cuadrado es: ");
		System.out.print(area);
		System.out.println();
		System.out.println();
	}
}