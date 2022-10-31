import java.util.Scanner;

public class Triangulo{
	private Scanner teclado;
	private float lado1, lado2, lado3;

	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor del primer lado: ");
		lado1 = teclado.nextFloat();
		System.out.print("Ingrese el valor del segundo lado: ");
		lado2 = teclado.nextFloat();
		System.out.print("Ingrese el valor del tercer lado: ");
		lado3 = teclado.nextFloat();
	}

	public void imprimeLadoMayor(){
		if (lado1 > lado2){
			if (lado1 > lado3)
				System.out.println("\tEl lado 1 mide " + lado1 + " y es el mayor");
			else if(lado1 == lado3)
				System.out.println("\tEl lado 1 y el 3 son los mayores con " + lado1);
			else 
				System.out.println("\tEl lado 3 mide " + lado3 + " y es el mayor");
		}
		else if (lado2 > lado1){
			if (lado2 > lado3)
				System.out.println("\tEl lado 2 mide " + lado2 + " y es el mayor");
			else if(lado2 == lado3)
				System.out.println("\tEl lado 2 y el 3 son los mayores con " + lado2);
			else 
				System.out.println("\tEl lado 3 mide " + lado3 + " y es el mayor");
		}
		else if (lado1 == lado2){
			if (lado1 < lado3)
				System.out.println("\tEl lado 3 mide " + lado3 + " y es el mayor");
			else if(lado1 > lado3)
				System.out.println("\tEl lado 1 y 2 son los mayores y miden " + lado1);
			else
				System.out.println("\tLos tres lados miden " + lado1);
		}
		else
			System.out.println("\tLos tres lados miden " + lado1);
	}

	public void imprimeValores(){
		System.out.println("\tLado 1: " + lado1);
		System.out.println("\tLado 2: " + lado2);
		System.out.println("\tLado 3: " + lado3);
	}

	public void esEquilatero(){
		if (lado1 == lado2 && lado2 == lado3)
			System.out.print("\tSe tiene un triángulo equilatero.");
	}

	public static void main(String[] arg){
		Triangulo tri = new Triangulo();
		tri.inicializar();
		tri.imprimeLadoMayor();
		tri.imprimeValores();
		tri.esEquilatero();	

	}

}