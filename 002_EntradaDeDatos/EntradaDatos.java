/*Obtiene el sueldo a pagar por empleado con base en su sueldo por hora y las horas trabajadas*/
import java.util.Scanner;

public class EntradaDatos{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int horasTrabajadas;
		float costoHora;
		float sueldo;
		System.out.println();
		System.out.print("Ingrese la cantidad de horas trabajadas por empleado: ");
		horasTrabajadas = teclado.nextInt();
		System.out.print("Ingrese el valor de la hora: ");
		costoHora = teclado.nextFloat();
		sueldo = costoHora * horasTrabajadas;
		System.out.println();
		System.out.print("El empleado debe cobrar: $");
		System.out.print(sueldo);
		System.out.println();
		System.out.println();
	}
	
}