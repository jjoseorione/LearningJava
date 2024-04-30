import java.util.Scanner;

public class NumeroMayor{
	public static void main(String[] arg){
		float num1;
		float num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextFloat();
		System.out.println();
		if (num1 > num2){
			System.out.print("El numero mayor es ");
			System.out.print(num1);
		}
		else if(num1 < num2){
			System.out.print("El numero mayor es ");
			System.out.print(num2);
		}
		else{
			System.out.print("Ambos numeros son iguales: ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.print(num2);
		}
		System.out.println();
		System.out.println();
	}
}