//Llamada todo lo estático de Clase1

package foo.bar;

import static foo.Clase1.*;

public class Clase4{
	public static void main(String[] args){
		System.out.println("En la clase 4. Paquete foo.bar. Llamada importando todo lo estático de Clase1");
		met1();
	}
}