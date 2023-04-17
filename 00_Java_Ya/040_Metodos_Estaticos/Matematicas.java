/*Así como una clase puede tener atributos estáticos, Java también permite definir métodos
estáticos que se crean independientemente a la definición de objetos. Un método estático puede 
llamarse sin tener que crear un objeto de dicha clase.

-No puede acceder a los atributos de la clase (salvo que sean estáticos)
-No puede utilizar el operador this, ya que este método se puede llamar sin 
tener que crear un objeto de la clase.
-Puede llamar a otro método siempre y cuando sea estático.
-Un método estático es lo más parecido a lo que son las funciones en los lenguajes 
estructurados (con la diferencia que se encuentra encapsulado en una clase)*/

public class Matematicas{
	public static final double PI = 3.141592;

	public static int suma(int x, int y){
		return (x + y);
	}

	public static int resta(int x, int y){
		return (x - y);
	}

	public static double areaCirculo(double r){
		double area = r*r*PI;
		return area;
	}

	public static void main(String[] args){
		System.out.println("\n\n\t**** Hola ****");
		if(args != null)
			for(int i = 0; i < args.length; i++)
				System.out.println("\t" + args[i]);
		System.out.println("\tfin");
	}
}