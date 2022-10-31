import java.util.Scanner;

public class CondicionIf{
	public static void main(String[] arg){
		float sueldo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba el sueldo del empleado: ");
		sueldo = teclado.nextFloat();
		if (sueldo >= 3000)
			System.out.print("El empleado debe pagar impuestos adicionales");
		else
			System.out.print("El empleado paga solo los impuestos normales");
	}
}