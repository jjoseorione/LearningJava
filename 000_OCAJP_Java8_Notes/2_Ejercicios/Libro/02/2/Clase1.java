//Clase que  crea la variable fuera del ciclo, la modifica dentro 
//del ciclo e imprime el valor después del ciclo.
//Hipótesis: El valor impreso será 10+9+8+7+6+5+4+3+2+1 = 55


public class Clase1{
	public static void main(String[] args){
		int valor = 0;
		int i = 10;

		while(i > 0){
			valor+=i;
			i--;
		}

		System.out.println("Valor = " + valor);
	}
}