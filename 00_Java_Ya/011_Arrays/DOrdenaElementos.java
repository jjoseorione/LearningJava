import java.util.Scanner;

public class DOrdenaElementos{
	private String[] nombres;
	private float[] sueldos;

	public static Scanner teclado = new Scanner(System.in);

	public static void puntos(int hs, boolean puntos){
		for(int i = 1; i <= hs; i++){
			if(puntos)
				System.out.print(".");
			try{Thread.sleep(500);}
			catch(InterruptedException e){}
		}
	}

	public void cargaElementos(){
		System.out.println();
		System.out.print("\tNúmero de datos a ingresar: ");
		int n = teclado.nextInt();
		nombres = new String[n];
		sueldos = new float[n];
		System.out.println();
		for(int i = 0; i < n; i++){
			System.out.print("\t\t" + (i+1) + ". Nombre: ");
			nombres[i] = teclado.next();
			System.out.print("\t\tSueldo de " + nombres[i] + ": ");
			sueldos[i] = teclado.nextFloat();
			System.out.println();
		}

		System.out.println("\tDatos cargados correctamente.");
		puntos(4, false);
	}

	public void ordenaNombres(){
		boolean ordenado = false;
		int i;
		System.out.println();
		System.out.print("\t\tOrdenando elementos");
		puntos(6, true);

		while(!ordenado){
			for(i = 0; i < (nombres.length-1); i++){
				if(nombres[i].compareTo(nombres[i+1]) > 0){
					String auxNom = nombres[i];
					float auxSue = sueldos[i];

					nombres[i] = nombres[i+1];
					sueldos[i] = sueldos[i+1];
					nombres[i+1] = auxNom;
					sueldos[i+1] = auxSue;
					break;
				}
			}
			if(i == nombres.length-1)
				ordenado = true;
		}
		System.out.println();
		System.out.println("\t\tElementos ordenados por nombre.");
		puntos(4,false);
	}

	public void ordenaSueldos(){
		boolean ordenado = false;
		int i;
		System.out.println();
		System.out.print("\t\tOrdenando elementos");
		puntos(6, true);

		while(!ordenado){
			for(i = 0; i < (sueldos.length-1); i++){
				if(sueldos[i] > sueldos[i+1]){
					String auxNom = nombres[i];
					float auxSue = sueldos[i];

					nombres[i] = nombres[i+1];
					sueldos[i] = sueldos[i+1];
					nombres[i+1] = auxNom;
					sueldos[i+1] = auxSue;
					break;
				}
			}
			if(i == sueldos.length-1)
				ordenado = true;
		}
		System.out.println();
		System.out.println("\t\tElementos ordenados por sueldo.");
		puntos(4,false);
	}

	public void imprime(){
		for(int i = 0; i < nombres.length; i++){
			System.out.println();
			System.out.println("\t\t" + (i+1) + ". " + nombres[i] + "\t\t\t" + sueldos[i]);
			puntos(1,false);
		}
	}


	public static void main(String[] args){
		DOrdenaElementos oe = new DOrdenaElementos();
		int r;
		System.out.println();
		System.out.println("**** ORDENAMIENTO DE VECTORES ****");
		do{
			System.out.println();
			System.out.println("Elija la opción deseada:");
			System.out.println("\t1. Cargar datos");
			System.out.println("\t2. Ordenar por nombre");
			System.out.println("\t3. Ordenar por sueldo");
			System.out.println("\t4. Mostrar datos");
			System.out.println("\t5. Salir");
			System.out.println();
			System.out.print("R: ");
			r = teclado.nextInt();

			switch(r){
				case 1:
					oe.cargaElementos();
					break;
				case 2:
					oe.ordenaNombres();
					break;
				case 3:
					oe.ordenaSueldos();
					break;
				case 4:
					oe.imprime();
					break;
				case 5:
					System.out.println();
					System.out.println("\tHasta pronto");
					oe.puntos(1, false);
					break;
				default:
					System.out.print("\tMames we...");
					oe.puntos(4, false);
					break;
			}
		}while(r != 5);
			
	}
}