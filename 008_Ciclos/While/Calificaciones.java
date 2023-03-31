import java.util.Scanner;

public class Calificaciones{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int aprobados = 0, reprobados = 0, cont = 0;
		float promedio = 0, calf, ultima = 0;
		System.out.print("Ingrese la cantidad de alumnos de su grupo: ");
		int n = teclado.nextInt();
		System.out.print("\nIngrese las calificaciones. Para corregir la última calificacion, ingrese -1.\n");
		while (cont <= n){
			if (cont == n){
				System.out.println("\nCalificaciones completas. Ingrese -1 para repetir la ultima calificacion o cualquier otro valor para finalizar.");
				calf = teclado.nextFloat();
				if (calf != -1)
					break;
			}
			else{
				System.out.print("\nIngrese la calificacion del alumno " + (cont+1) + ": ");
				calf = teclado.nextFloat();
			}

			if (calf == -1 && cont >= 1){
				System.out.println("Se repite la calificacion anterior. ");
				if (ultima >= 0 && ultima < 6)
					reprobados--;
				else if (ultima >= 6 && ultima <= 10)
					aprobados --;
				promedio -= ultima;
				cont--;
				continue;
			}
			else if (calf >= 0 && calf < 6)
				reprobados++;
			else if (calf >= 6 && calf <= 10)
				aprobados ++;
			else{
				System.out.print("Error. Intente nuevamente. ");
				continue;
			}
			System.out.println("OK");
			ultima = calf;
			promedio += calf;
			cont++;
		}
		promedio /= n;
		System.out.println("Su grupo tiene " + reprobados + " alumnos reprobados y " + aprobados + " alumnos aprobados. El promedio de todo su grupo es de " + promedio + ".");


	}
}