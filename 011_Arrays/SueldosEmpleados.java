import java.util.Scanner;

public class SueldosEmpleados{
	private Scanner teclado;
	private int[] sueldos;	//Declaramos el arreglo sueldos como tipo arreglo de enteros int[]

	public void cargar(){
		teclado = new Scanner(System.in);
		sueldos = new int[5];		//Se define con la palabra new ya que los arreglos son objetos
		for (int f = 0; f <= 4; f++){
			System.out.println("Escriba el sueldo del empleado " + (f+1) + ": ");
			sueldos[f] = teclado.nextInt();
		}
	}

	public void imprimir(){
		System.out.println("Los sueldos son: ");
		for (int f = 0; f < 5; f++)
			System.out.print(sueldos[f] + " ");
	}

	public static void main(String[] args){
		SueldosEmpleados sueldos = new SueldosEmpleados();
		sueldos.cargar();
		sueldos.imprimir();
	}
}