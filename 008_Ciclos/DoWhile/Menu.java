import java.util.Scanner;

public class Menu{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int r;

		do{
			System.out.print("\n\n\tElija una opción del menú\n");
			System.out.print("\n\t1. Mentada de madre");
			System.out.print("\n\t2. Felicitacion");
			System.out.print("\n\t3. Ladrido");
			System.out.print("\n\t4. Salir");
			System.out.print("\n\n\tSu respuesta:");
			r = teclado.nextInt();

			switch (r){
				case 1:{
					System.out.println("\n\n\t******** Chingue uste a su madre xdxdxddxddxdddx ********");
					break;
				}
				case 2:{
					System.out.println("\n\n\t******** Felicidades :D ********");
					break;
				}
				case 3:{
					System.out.println("\n\n\t******** Guau guau ********");
					break;
				}
				case 4:{
					break;
				}
				default:{
					System.out.println("\n\n\tMames we. Intenta de nuevo");
				}
			}
		}
		while(r != 4);
	}

}