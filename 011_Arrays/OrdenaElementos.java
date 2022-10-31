import java.util.Scanner;

public class OrdenaElementos{
	private Scanner teclado;
	private String[] nombres;
	private int[] sueldos;

	public void cargaDatos(){
		teclado = new Scanner(System.in);
		System.out.print("\n\nCarga de datos. Cantidad de datos a cargar: ");
		int n = teclado.nextInt();
		nombres = new String[n];
		sueldos = new int[n];

		System.out.print("\n");
		for (int i = 0; i < nombres.length; i++){
			System.out.print("\tEscriba nombre: ");
			nombres[i] = teclado.next();
			System.out.print("\tEscriba el sueldo de " + nombres[i] + ": ");
			sueldos[i] = teclado.nextInt();
			System.out.print("\n");
		}
		System.out.print("\nDatos cargados exitosamente.\n");
	}

	public void ordenaSueldos(){
		boolean ordenados = false;
		int auxS;
		String auxN;
		while(!ordenados){
			for (int i = 1; i < nombres.length; i++){
				if (sueldos[i] < sueldos[i-1]){
					auxS = sueldos[i-1];
					sueldos[i -1] = sueldos[i];
					sueldos[i] = auxS;
					auxN = nombres[i-1];
					nombres[i -1] = nombres[i];
					nombres[i] = auxN;
					ordenados = false;
					break;
				}
				else if(i == (nombres.length - 1))
					ordenados = true;
			}
		}
	}

	public void ordenaNombres(){
		boolean ordenados = false;
		int auxS;
		String auxN;
		while(!ordenados){
			for (int i = 1; i < nombres.length; i++){
				if (nombres[i].compareTo(nombres[i-1]) < 0){
					auxS = sueldos[i-1];
					sueldos[i -1] = sueldos[i];
					sueldos[i] = auxS;
					auxN = nombres[i-1];
					nombres[i -1] = nombres[i];
					nombres[i] = auxN;
					ordenados = false;
					break;
				}
				else if(i == (nombres.length - 1))
					ordenados = true;
			}
		}
	}

	public void imprimir(){
		System.out.print("\n\nDatos ordenados:\n");
		for (int i = 0; i < nombres.length; i++)
			System.out.print("\t" + nombres[i] + " " + sueldos[i] + "\n");
	}

	public static void main(String[] args){
		OrdenaElementos oe = new OrdenaElementos();
		Scanner tec = new Scanner(System.in);
		int r;
		do{
			System.out.print("\n\t1. Cargar datos");
			System.out.print("\n\t2. Ordena por sueldo");
			System.out.print("\n\t3. Ordena por nombre");
			System.out.print("\n\t4. Imprime datos");
			System.out.print("\n\tPara salir ingrese 0");
			System.out.print("\n\n\tRespuesta: ");
			r = tec.nextInt();

			if (r == 1)
				oe.cargaDatos();
			else if(r == 2)
				oe.ordenaSueldos();
			else if(r == 3)
				oe.ordenaNombres();
			else if(r == 4)
				oe.imprimir();
			else if(r == 0)
				System.out.print("\n\nHasta la vista.");
			else
				System.out.print("Mames we\n");
		}
		while (r != 0);
	}
}