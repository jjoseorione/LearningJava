import java.util.Scanner;

public class Cadenas{
	public static void main(String[] args){
		//Las cadenas son objetos. Por lo tanto no pueden ser comparadas directamente, pues
		//en este, sólo se comparan las referencias a memoria. En ocasiones pueden coincidir (ambos objetos
		//apuntan a la misma cadena cuando las cadenas se crean en tiempo de compilación), pero en ocasiones 
		//pueden diferir (cuando las cadenas no se crean en tiempo de compilación).
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		cadena1 = "hola";
		cadena2 = "hola";
		String cadena3 = new String("hola");
		System.out.println("cadena1: " + cadena1);
		System.out.println("cadena2: " + cadena2);
		System.out.println("cadena3: " + cadena3);
		System.out.print("cadena4: ");
		String cadena4 = teclado.next();

		System.out.println("\nCon ==");
		if(cadena1 == cadena2)
			System.out.println("cadena1 y cadena2 son iguales");
		else
			System.out.println("cadena1 y cadena2 no son iguales");
		if(cadena2 == cadena3)
			System.out.println("cadena2 y cadena3 son iguales");
		else
			System.out.println("cadena2 y cadena3 no son iguales");
		if(cadena1 == cadena3)
			System.out.println("cadena1 y cadena3 son iguales");
		else
			System.out.println("cadena1 y cadena3 no son iguales");

		if(cadena4 == cadena1)
			System.out.println("cadena4 y cadena1 son iguales");
		else
			System.out.println("cadena4 y cadena1 no son iguales");
		if(cadena4 == cadena2)
			System.out.println("cadena4 y cadena2 son iguales");
		else
			System.out.println("cadena4 y cadena2 no son iguales");
		if(cadena4 == cadena3)
			System.out.println("cadena4 y cadena3 son iguales");
		else
			System.out.println("cadena4 y cadena3 no son iguales");

		System.out.println("\nCon equals");
		if(cadena1.equals(cadena2))
			System.out.println("cadena1 y cadena2 son iguales");
		else
			System.out.println("cadena1 y cadena2 no son iguales");
		if(cadena2.equals(cadena3))
			System.out.println("cadena2 y cadena3 son iguales");
		else
			System.out.println("cadena2 y cadena3 no son iguales");
		if(cadena1.equals(cadena3))
			System.out.println("cadena1 y cadena3 son iguales");
		else
			System.out.println("cadena1 y cadena3 no son iguales");

		if(cadena4.equals(cadena1))
			System.out.println("cadena4 y cadena1 son iguales");
		else
			System.out.println("cadena4 y cadena1 no son iguales");
		if(cadena4.equals(cadena2))
			System.out.println("cadena4 y cadena2 son iguales");
		else
			System.out.println("cadena4 y cadena2 no son iguales");
		if(cadena4.equals(cadena3))
			System.out.println("cadena4 y cadena3 son iguales");
		else
			System.out.println("cadena4 y cadena3 no son iguales");
		System.out.println("************************************");
		System.out.println();

		String cadena5 = cadena1;
		cadena1 = "Adios";

		System.out.println("cadena1 = " + cadena1);
		System.out.println("cadena5 = " + cadena5);
	}
}