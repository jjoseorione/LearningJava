import java.util.Scanner;

public class aSueldos{
	public static Scanner teclado = new Scanner(System.in);
	//Los arreglos son objetos, por lo tanto se deben crear con el 
	//operador new de la siguiente forma:
	private float[] sueldos = new float[5];

	void init(){
		System.out.println("Ingresar sueldos");
		for(int i = 0; i < 5; i++){
			System.out.print("\nEmpleado " + (i+1) + ": ");
			sueldos[i] = teclado.nextFloat();
		}
	}

	void imprime(){
		System.out.println("Los sueldos son:");
		for(int i = 0; i < 5; i++)
			System.out.print("\nEmpleado " + (i+1) + ": " + sueldos[i]);
	}

	public static void main(String[] args){
		Sueldos s1 = new Sueldos();
		s1.init();
		s1.imprime();
	}
}