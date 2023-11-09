//Llamada importando todo el paquete

package foo.bar;

import foo.*;

public class Clase2{
	public static void main(String args){
		System.out.println("En la clase 2. Paquete foo.bar");
		Clase1.met1();
	}
}