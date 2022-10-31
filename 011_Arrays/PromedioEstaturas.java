import java.util.Scanner;

public class PromedioEstaturas{
	private Scanner teclado;
	private float[] estaturas;
	private float promedio;

	public void cargar(){
		teclado = new Scanner(System.in);
		estaturas = new float[5];
		for (int i = 0; i < 5; i++){
			System.out.print("Estatura de la persona" + (i+1) + ": ");
			estaturas[i] = teclado.nextFloat();
		}
	}

	public void ImprimeProm(){
		promedio = 0;
		for (int i = 0; i < 5; i++){
			promedio += estaturas[i];
		}
		promedio /= 5;
		System.out.print("El promedio es " + promedio);
	}

	public static void main(String[] args){
		PromedioEstaturas est = new PromedioEstaturas();
		est.cargar();
		est.ImprimeProm();
	}
}