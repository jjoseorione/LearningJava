import java.util.Scanner;

public class Sueldos{
	private Scanner teclado;
	private int[] sueldos;

	//El constructor tiene el mismo nombre que la clase
	public Sueldos(){
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		System.out.print("\n\n\tIngrese 5 sueldos:\n");
		for (int i = 0; i < sueldos.length; i++){
			System.out.print("\t" + (i+1) + ": ");
			sueldos[i] = teclado.nextInt();
		}
	}

	public void imprimir(){
		System.out.print("\n\n\tLos datos cargados son los siguientes:\n");
		for (int i = 0; i < sueldos.length; i++)
			System.out.print("\n\t" + (i+1) + ": " + sueldos[i]);
	}

	public static void main(String[] args){
		Sueldos s = new Sueldos();
		s.imprimir();
	}
}