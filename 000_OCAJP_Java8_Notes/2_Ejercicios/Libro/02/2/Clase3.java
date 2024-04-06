//Clase que  crea la variable dentro del ciclo, la modifica dentro
//del ciclo e imprime el valor después del ciclo
//Hipótesis: No compilará debido a que la variable deja de existir
//cuando el ciclo finaliza y no se puede leer fuera del ciclo.


public class Clase3{
	public static void main(String[] args){
		//int valor = 0;
		int i = 10;

		while(i > 0){
			int valor = 1;
			valor+=i;
			i--;
		}

		System.out.println("Valor = " + valor);
	}
}