import java.util.Scanner;

public class PromedioCalificaciones{
	public static void main(String[] arg){
		float cal1;
		float cal2;
		float cal3;
		float promedio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calificacion de Matematicas: ");
		cal1 = teclado.nextFloat();
		System.out.print("Calificacion de Fisica: ");
		cal2 = teclado.nextFloat();
		System.out.print("Calificacion de Ingles: ");
		cal3 = teclado.nextFloat();
		promedio = (cal1 + cal2 + cal3) / 3;
		if (promedio == 10)
			System.out.print("Alumno de excelencia con promedio de " + promedio + ". Recibe Diploma");
		else if(promedio >= 8 && promedio < 10)
			System.out.print("Alumno destacado con promedio de " + promedio + ". Muchas felicidades");
		else if(promedio >= 6 && promedio < 8)
			System.out.print("Alumno aprobado con promedio de " + promedio);
		else
			System.out.print("Alumno reprobado. Promedio: " + promedio);
	}
}