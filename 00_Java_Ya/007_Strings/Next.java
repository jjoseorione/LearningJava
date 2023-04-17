import java.util.Scanner;

public class Next{
	public static void main(String[] args){
		//La función Next sirve para leer cadenas separadas por espacios o saltos de línea. 
		//Si se escribe una cadena de varias palabras separadas por espacios, se usará una 
		//función Next por cada palabra
		Scanner teclado = new Scanner(System.in);
		String apPat, apMat, nombre;
		System.out.println("Escriba nombre completo empezando por apellidos: ");
		System.out.print("Apellido paterno: ");
		apPat = teclado.next();
		System.out.print("Apellido materno: ");
		apMat = teclado.next();
		System.out.print("Nombre: ");
		nombre =teclado.next();
		System.out.println("\n\nNombre: " + apPat + " " + apMat + " " + nombre);
	}
}