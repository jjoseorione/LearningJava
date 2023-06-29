
import java.util.Scanner;

public class Tablas{
	public float alCuadrado(float base){
		float cuadrado = base*base;
		return cuadrado;
	}
	public static float alCubo(float base){
		float cubo = base*base*base;
		return cubo;
	}
	public static void tabla(float base){
		for(int i = 1; i <= 10; i++){
			System.out.print("\n\t\t" + base + " * " + i + " = " + (i*base));
			Tablas.espera(3, true);
		}
	}
	public static void espera(int p, boolean puntos){
		for(int i = 1; i <= p; i++){
			if(puntos)
				System.out.print(".");
			try{Thread.sleep(500);}
			catch(InterruptedException ex){}
		}

	}
	public static void main(String[] args){
		Tablas p1 = new Tablas();
		Scanner teclado = new Scanner(System.in);
		float base = 0;
		int r;
		do{
			System.out.print("\n\n**************** MENÚ ****************");
			System.out.print("\nElija la opción deseada:");
			System.out.print("\n\t1. Ingresar base nueva");
			System.out.print("\n\t2. Consultar base");
			System.out.print("\n\t3. Calcular cuadrado");
			System.out.print("\n\t4. Calcular cubo");
			System.out.print("\n\t5. Calcular tabla de multiplicar");
			System.out.print("\n\t6. Salir");
			System.out.print("\n\tR: ");
			r = teclado.nextInt();
			switch(r){
				case 1:
					System.out.print("\n\t\tIngresar base: ");
					base = teclado.nextFloat();
					System.out.print("\t\tBase recibida correctamente");
					Tablas.espera(3, false);
					break;
				case 2:
					System.out.print("\n\t\tConsultando");
					Tablas.espera(3, true);
					System.out.print("\n\t\tBase = " + base);
					Tablas.espera(3, false);
					break;
				case 3:
					System.out.print("\n\t\tCalculando");
					Tablas.espera(3, true);
					System.out.print("\n\t\tR: " + p1.alCuadrado(base));
					Tablas.espera(3, false);
					break;
				case 4:
					System.out.print("\n\t\tCalculando");
					Tablas.espera(3, true);
					System.out.print("\n\t\tR: " + Tablas.alCubo(base));
					Tablas.espera(3, false);
					break;
				case 5:
					Tablas.tabla(base);
					break;
				case 6:
					System.out.print("\n\n\tHasta luego");
					Tablas.espera(5, false);
					break;
				default:
					System.out.print("\n\n\tRespuesta no recibida. Intentar nuevamente");
					Tablas.espera(5, false);
					break;
			}
		}while(r != 6);
	}
}