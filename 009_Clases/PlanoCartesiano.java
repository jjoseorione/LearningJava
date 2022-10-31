import java.util.Scanner;

public class PlanoCartesiano{
	private float x;
	private float y;
	private Scanner teclado;

	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Valor de X: ");
		x = teclado.nextFloat();
		System.out.print("Valor de Y: ");
		y = teclado.nextFloat();
	}

	public void imprimeValores(){
		System.out.println("\nX: " + x);
		System.out.println("Y: " + y);
	}

	public void defineCuadrante(){
		if (x > 0){
			if (y > 0)
				System.out.println("El punto se encuentra en el cuadrante I");
			else if(y == 0)
				System.out.println("El punto se encuentra entre el cuadrante I y IV");
			else
				System.out.println("El punto se encuentra en el cuadrante IV");
		}
		else if (x == 0){
			if (y > 0)
				System.out.println("El punto se encuentra entre el cuadrante I y II");
			else if (y == 0)
				System.out.println("El punto se encuentra en el origen");
			else
				System.out.println("El punto se encuentra en el cuadrante III y IV");
		}
		else{
			if (y > 0)
				System.out.println("El punto se encuentra en el cuadrante II");
			else if(y == 0)
				System.out.println("El punto se encuentra entre el cuadrante II y III");
			else
				System.out.println("El punto se encuentra en el cuadrante III");
		}
	}

	public static void main(String[] arg){
		PlanoCartesiano plano = new PlanoCartesiano();
		plano.inicializar();
		plano.imprimeValores();
		plano.defineCuadrante();
	}
}