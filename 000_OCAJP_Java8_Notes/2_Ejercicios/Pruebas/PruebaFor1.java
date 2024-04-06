//Codigo que muestra que es posible utilizar más de una expresión dentro de la
//sección de actualización de un ciclo for.

public class PruebaFor1{
	public static void main(String[] args){
		for(int i = 0; i<10; System.out.println("El valor de i es " + i), metodo(), i++);
	}

	public static void metodo(){
		System.out.println("\n\n\t\t****Metodo****\n\n");
	}
} 