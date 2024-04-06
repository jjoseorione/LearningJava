//Clase que  crea la variable fuera del ciclo y crea otra
//del mismo nombre dentro del ciclo.
//Hipótesis: No compilará debido a que ya existe una variable con
//ese nombre dentro del método


public class Clase2{
	public static void main(String[] args){
		int valor = 0;
		int i = 10;

		while(i > 0){
			int valor = 1;
			valor+=i;
			i--;
		}

		System.out.println("Valor = " + valor);
	}
}