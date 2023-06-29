import java.util.Scanner;

public class Resta extends Operacion{
	public Resta(){
		//Aquí se ejecuta super() aunque nostros no lo escribamos, ya que siempre se ejecuta el constructor de la
		//clase padre al inicio luego el del hijo (si los hay). Esto nos muestra que el constructor de la clase hija
		//no sobreescribe al de la clase padre.
		Scanner teclado = new Scanner(System.in);

		System.out.println("\tValor de x:");
		x = teclado.nextInt();
		System.out.println("\tValor de y:");
		y = teclado.nextInt();
		//pruebaPrivate = true;		//Esta línea devuelve error por modificador de acceso privado
		pruebaPublic = true;
		pruebaProtected = true;
		//super() Si yo escribo super al inicio de la clase
	}
	public Resta(int x, int y){
		//Aquí se ejecuta super(x, y) aunque nostros no lo escribamos
		this.x = x;
		this.y = y;
	}
	public void operar(){
		r = x - y;
	}
}