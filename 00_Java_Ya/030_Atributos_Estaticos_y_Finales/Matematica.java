/*Un atributo estático reserva espacio para el mismo indistintamente que 
definamos un objeto de dicha clase. En caso de crear varios objetos de dicha 
clase todas las instancias acceden al mismo atributo estático.

Podemos agregar la palabra final para que el valor del atributo no cambie al asignado. Podemos
inicializar el valor desde que se declara el atributo o dentro del constructor. Después no será
posible cambiar el valor del atributo en otra sección del programa*/

public class Matematica{
	public final static double PI = 3.141592;
	public final int x;

	public Matematica(int x){
		this.x = x;
	}

	public static void main(String[] args){
		System.out.println("Con clase: Matematica.PI = " + Matematica.PI);
		Matematica m = new Matematica(10);
		System.out.println("Con objeto: m.PI = " + m.PI);
		System.out.println("x = " + m.x);
		//Las siguientes lineas arrojarán un error de compilación, ya que no se puede cambiar
		//el valor de las variables
		//m.x++;
		//m.PI++;
	}
}