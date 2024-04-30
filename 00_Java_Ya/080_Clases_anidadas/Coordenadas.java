/* Confeccionar una clase llamada Coordenadas que almacene la referencia de puntos en el plano
mediante x e y. Declarar una clase interna que represente un punto en el plano.
La clase Coordenada debe almacenar en un ArrayList con elementos de tipo Punto. Además la clase
Coordenadas debe poder calcular la cantidad de puntos almacenados en cada cuadrante. 
hay varios tipos de clases anidadas en Java:

Clase anidada interna.
Clase anidada estática.
Clase local.
Clase anónima.

Clase anidada interna.
El anidamiento de una clase tiene por objetivo favorecer el encapsulamiento. Una clase anidada 
se dice que es interna si se la declara dentro de otra clase pero fuera de cualquier método de 
la clase contenedora.

Puede declararse con cualquiera de los modificadores: private, protected o public.

Una característica fundamental es que una clase interna tiene acceso a todos los atributos de la 
clase que la contiene, luego para que exista una clase anidada interna es necesario que exista un 
objeto de la clase contenedora.
*/
import java.util.ArrayList;

public class Coordenadas{
	public class Punto{
		public int x;
		public int y;

		public Punto(int x, int y){
			this.x = x;
			this.y = y;
		}

		public int devuelveCuadrante(){
			if (x > 0 && y > 0)
				return 1;
			else if(x < 0 && y > 0)
				return 2;
			else if(x < 0 && y < 0)
				return 3;
			else if(x > 0 && y < 0)
				return 4;
			else
				return -1;
		}
	}

	private ArrayList<Punto> puntos;

	public Coordenadas(){
		puntos = new ArrayList<Punto>();
	}

	public void agregarPunto(int x, int y){
		puntos.add(new Punto(x, y));
	}

	public int devuelvePuntosEnCuadrante(int cuad){
		int pts = 0;
		for(Punto pt : puntos){
			if (pt.devuelveCuadrante() == cuad)
				pts++;
		}

		return pts;
	}
}