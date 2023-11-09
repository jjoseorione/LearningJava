package paquete2

import paquete1.Clase1;

public class Clase2{
	public static void main(String[] args){
		Clase1 c1 = new Clase1();
		System.out.println(c1.campo1);
		System.out.println(c1.campo2);
		System.out.println(c1.campo3);
		System.out.println(Clase1.campo4);
		System.out.println(Clase1.campo5);
		System.out.println(Clase1.campo6);
		c1.metodo1();
		c1.metodo2();
		Clase1.metodo3(3);
	}
}