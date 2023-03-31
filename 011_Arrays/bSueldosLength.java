import java.util.Scanner;

public class bSueldosLength{
	private static Scanner teclado = new Scanner(System.in);
	private float[] sueldos;

	public void init(){
		System.out.print("\n\n¿Cuántos sueldos va a cargar?\nR: ");
		int n = teclado.nextInt();
		sueldos = new float[n];
		for(int i = 0; i < n; i++){
			System.out.print("\tIngrese el sueldo del empleado " + (i+1) + ": ");
			sueldos[i] = teclado.nextFloat();
		}
		System.out.print("\nSueldos ingresados correctamente");
		try{Thread.sleep(1000);}
		catch(InterruptedException ex){}
	}

	public void imprimir(){
		System.out.print("\nLos " + sueldos.length + " sueldos ingresados son los siguientes: ");
		for(int i = 0; i < sueldos.length; i++)
			System.out.print("\n\tEmpleado " + (i+1) + ": " + sueldos[i]);
	}

	public static void main(String[] args){
		bSueldosLength s1 = new bSueldosLength();
		s1.init();
		s1.imprimir();
	}
}