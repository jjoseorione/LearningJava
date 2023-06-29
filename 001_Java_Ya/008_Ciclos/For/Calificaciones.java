import java.util.Scanner;

public class Calificaciones{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int aprobados = 0, reprobados = 0;
		float promedio = 0, calf, ultima = -1;
		System.out.println();
		System.out.print("Ingrese la cantidad de alumnos de su grupo: ");
		int n = teclado.nextInt();
		System.out.print("\nIngrese las calificaciones. Para corregir la última calificacion, ingrese -1.\n");
		for (int cont = 1; cont <= (n+1); cont++){
			if (cont == n){
				System.out.print("\nCalificaciones completas. Ingrese -1 para repetir la ultima calificacion o cualquier otro valor para finalizar: ");
				calf = teclado.nextFloat();
			}
			else{
				System.out.print("\nIngrese la calificacion del alumno " + cont + ": ");
				calf = teclado.nextFloat();
			}

			if (calf == -1 && cont >  1){
				System.out.println("Se repite la calificacion anterior. ");
				if (ultima >= 0 && ultima < 6)
					reprobados--;
				else if (ultima >= 6 && ultima <= 10)
					aprobados --;
				promedio -= ultima;
				cont-=2;
				continue;
			}
			else if (calf >= 0 && calf < 6)
				reprobados++;
			else if (calf >= 6 && calf <= 10)
				aprobados ++;
			else{
				System.out.println("Error. Intente nuevamente.");
				cont--;
				continue;
			}
			System.out.println("OK");
			ultima = calf;
			promedio += calf;
		}
		promedio /= n;
		System.out.println();
		System.out.println("Su grupo tiene " + reprobados + " alumnos reprobados y " + aprobados + " alumnos aprobados. El promedio de todo su grupo es de " + promedio + ".");


	}
}