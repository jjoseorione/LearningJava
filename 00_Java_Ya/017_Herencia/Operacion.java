//Ejemplo de herencia. Operación es la clase padre
//Las variables boolean serán para mostrar el funcionamiento de los modificadores
//de acceso en herencia

import java.util.Scanner;

public class Operacion{
	protected int x;
	protected int y;
	protected int r;
	private boolean pruebaPrivate;
	public boolean pruebaPublic;
	public boolean pruebaProtected;

	public Operacion(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Operacion(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("\tx: ");
		x = teclado.nextInt();
		System.out.print("\ty: ");
		y = teclado.nextInt();
		System.out.print("\n");
	}

	public void imprimir(){
		System.out.print("\n\tx: " + x);
		System.out.print("\ty: " + y);
		System.out.print("\tr: " + r);
		System.out.print("\tPublic: " + pruebaPublic);
		System.out.print("\tPrivate: " + pruebaPrivate);
		System.out.print("\tProtected: " + pruebaProtected);
	}
}