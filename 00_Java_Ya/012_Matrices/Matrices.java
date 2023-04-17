import java.util.Scanner;

public class Matrices{
	private int[][] matriz;

	public void cargar(){
		Scanner teclado = new Scanner(System.in);
		matriz = new int[3][3];
		System.out.print("\n\n\tCarga de valores\n");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print("\tIngrese el elemento " + (i+1) + ", " + (j+1) + ": ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.print("\n\tCarga finalizada\n");
	}

	public void imprimeMatriz(){
		System.out.println();
		for (int i = 0; i < 3; i++){
			System.out.print("\t|");
			for (int j = 0; j < 3; j++)
				System.out.print(" " + matriz[i][j] + " ");
			System.out.print("|\n");
		}
	}

	public void imprimeDiagonal(){
		for (int i = 0; i < 3; i++){
			System.out.println();
			System.out.print("|");
			System.out.print(" " + matriz[i][i] + " ");
		}
	}

	public static void main(String[] args){
		Matrices m = new Matrices();
		int r;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.print("\n\n\tElija la opción deseada");
			System.out.print("\n\t1. Cargar valores" +
				"\n\t2. Imprimir Matriz " + 
				"\n\t3. Imprimir Diagonal " +
				"\n\tPresione 0 para salir " +
				"\n\n\tR: ");

			r = teclado.nextInt();

			if (r == 1)
				m.cargar();
			else if (r == 2)
				m.imprimeMatriz();
			else if (r == 3)
				m.imprimeDiagonal();
			else if(r == 0)
				System.out.print("\n\n\tHasta la vista");
			else
				System.out.print("\n\n\tSeas mamón");
		}
		while (r != 0);
	}
}