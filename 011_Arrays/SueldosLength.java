import java.util.Scanner;

public class SueldosLength{
	private Scanner teclado;
	private int[] sueldos;

	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.print("¿Cuántos sueldos cargará?");
		int cantidad = teclado.nextInt();
		sueldos = new int[cantidad];
		for (int i = 0; i < cantidad; i++){
			System.out.print("\n\tIngrese sueldo del empleado " + (i+1) + ": ");
			sueldos[i] = teclado.nextInt();
		}
	}

	public void imprimir(){
		for (int i = 0; i < sueldos.length; i++){
			System.out.println("El sueldo del empleado " + (i+1) + " es " + sueldos[i]);
		}
	}

	public static void main(String[] args){
		SueldosLength sl = new SueldosLength();
		sl.cargar();
		sl.imprimir();
	}
}