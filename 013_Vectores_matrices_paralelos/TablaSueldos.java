import java.util.Scanner;

public class TablaSueldos{
	private String[] empleados;
	private int[][] sueldoMensual;
	private int[] sueldoTrimestre;
	private Scanner teclado;
	private int mayor, total = 0, n;

	public void cargarInfo(){
		teclado = new Scanner(System.in);
		System.out.print("\n\n\tCarga de información. Empleados a procesar: ");
		n = teclado.nextInt();
		empleados = new String[n];
		sueldoMensual = new int[n][3];
		sueldoTrimestre = new int[n];

		for (int i = 0; i < n; i++){
			System.out.print("\n\tIngrese el nombre del empleado: ");
			empleados[i] = teclado.next();
			sueldoTrimestre[i] = 0;
			for (int j = 0; j < 3; j++){
				System.out.print("Escriba el sueldo " + (j+1) + " de " + empleados[i] + ": ");
				sueldoMensual[i][j] = teclado.nextInt();
				sueldoTrimestre[i] += sueldoMensual[i][j];
				total += sueldoMensual[i][j];
			}
		}
		System.out.print("\n\n\tDatos cargados.");
	}

	public void imprimeDatos(){
		for (int i = 0; i < n; i++){
			System.out.print("\n\tEmpleado: " + empleados[i]);
			for (int j = 0; j < 3; j++)
				System.out.print("\n\t\tSueldo mes " + (j+1) + ": " + sueldoMensual[i][j]);
			System.out.print("\n\t\tSueldo del trimestre: " + sueldoTrimestre[i]);
		}
	}

	public void obtieneMayor(){
		int mayor = sueldoTrimestre[0];
		int emp = 0;
		for (int j = 1; j < 3; j++){
			if (sueldoTrimestre[j] > mayor){
				mayor = sueldoTrimestre[j];
				emp = j;
			}
		}
		System.out.print("\n\n\tEl sueldo mayor pertenece al empleado " + empleados[emp] +
			"y es de " + sueldoTrimestre[emp] );
	}

	public void imprimeTotal(){
		System.out.print("\n\n\tEl total pagado en los ultimos 3 meses es de " + total);
	}

	public static void main(String[] args){
		TablaSueldos ts = new TablaSueldos();
		Scanner tec = new Scanner(System.in);
		int r;
		do{
			System.out.print("\n\n\tSueldos trimestrales"+
				"\n\tElija una opción:\n" +
				"\n\t1. Cargar valores" +
				"\n\t2. Imprimir Datos" +
				"\n\t3. Obtener empleado con mayores ingresos" +
				"\n\t4. Obtener nomina total" +
				"\n\t Ingrese 0 para salir" +
				"\n\n\t\tR: ");
			r = tec.nextInt();

			if (r == 0)
				System.out.print("\n\tHasta la vista");
			else if (r == 1)
				ts.cargarInfo();
			else if (r == 2)
				ts.imprimeDatos();
			else if (r == 3)
				ts.obtieneMayor();
			else if (r == 4)
				ts.imprimeTotal();
			else
				System.out.print("\n\tMames we.");
		}
		while (r != 0);
	}


}

