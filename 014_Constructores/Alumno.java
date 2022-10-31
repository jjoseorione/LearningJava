//Ejemplo de constructor con argumentos
import java.util.Scanner;

public class Alumno{
	private String nombre;
	private int edad;
	private String curp;

	public Alumno(String nombre, int edad, String curp){
		this.nombre = nombre;		//Usando this hacemos referencia al atributo
		this.edad = edad;
		this.curp =curp;

		/*Otra forma de hacerlo sería declarar parámetros con nombres diferentes
		a los de los atributos. En este caso no es necesario usar this.*/
	}

	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("CURP: " + curp);
	}

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Alumno a1 = new Alumno("Emmanuel", 28, "ENMA080791");
		a1.imprimir();
		Alumno a2 = new Alumno("Federico", 69, "FEDE024960");
		a2.imprimir();
	}
}