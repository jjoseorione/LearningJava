//Llamada importando todo el paquete

package foo.bar;

import foo.*;

public class Clase3{
	public static void main(String[] args){
		System.out.println("En la clase 3. Paquete foo.bar. Llamada importando todo el paquete");
		Clase1.met1();
	}
}