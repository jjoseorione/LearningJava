/* Persona.numObj es accesible desde cualquier objeto o desde la clase.
Cualquier objeto o la clase misma puede cambiar el valor. */

public class PruebaPersona{
	public static void main(String[] args){
		Persona p1 = new Persona("José", 25);
		Persona p2 = new Persona("Emmanuel", 28);
		Persona p3 = new Persona("Peque", 6);
		Persona p4 = new Persona("Esther", 25);
		System.out.print("Existen " + Persona.numObj + " objetos.");
	}
}