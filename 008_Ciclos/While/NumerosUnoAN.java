import java.util.Scanner;

public class NumerosUnoAN{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.print("¿Hasta que numero deseas visualizar? R: ");
		int n = teclado.nextInt();
		int x = 1;
		System.out.println();
		if(n <= 3000){
			while (x <= n){
				try{Thread.sleep(100);}
				catch(InterruptedException e){}
				System.out.println(x);
				x++;
			}
		}
		else if(n/600 < 60)
			System.out.println("Tampoco mames we, es un vergo. Me voy a tardar " + (n/600f) + " minutos en terminar.");
		else if(n/36000 < 24)
			System.out.println("Tampoco mames we, es un vergo. Me voy a tardar " + (n/36000f) + " horas en terminar.");
		else
			System.out.println("Tampoco mames we, es un vergo. Me voy a tardar " + (n/864000f) + " días en terminar.");
	}
}