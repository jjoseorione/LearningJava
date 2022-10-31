/* Definir un atributo estático que almacene la cantidad de objetos 
creados de dicha clase.*/

public class Persona{
	private String nombre;
	private int edad;
	public static int numObj = 0;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		numObj++;
	}

	public void imprimir(){
		System.out.print("\nNombre: " + nombre + "\nEdad: " + edad);
	}
}