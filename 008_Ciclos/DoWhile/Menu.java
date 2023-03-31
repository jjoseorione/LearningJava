import java.util.Scanner;

public class Menu{
	public static void medioSegundo(){
		try{Thread.sleep(100);}
		catch(InterruptedException e){}
	}
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int r;

		do{
			System.out.print("\n\n\tElija una opción del menú\n");
			System.out.print("\n\t1. Mentada de madre");
			System.out.print("\n\t2. Felicitacion");
			System.out.print("\n\t3. Ladrido");
			System.out.print("\n\t4. Salir");
			System.out.print("\n\n\tSu respuesta: ");
			r = teclado.nextInt();

			switch (r){
				case 1:{
					System.out.print("\n\n\tC"); medioSegundo();
					System.out.print("h"); medioSegundo();
					System.out.print("i"); medioSegundo();
					System.out.print("n"); medioSegundo();
					System.out.print("g"); medioSegundo();
					System.out.print("a"); medioSegundo();
					System.out.print("s"); medioSegundo();
					System.out.print(" "); medioSegundo();
					System.out.print("a"); medioSegundo();
					System.out.print(" "); medioSegundo();
					System.out.print("t"); medioSegundo();
					System.out.print("u"); medioSegundo();
					System.out.print(" "); medioSegundo();
					System.out.print("m"); medioSegundo();
					System.out.print("a"); medioSegundo();
					System.out.print("d"); medioSegundo();
					System.out.print("r"); medioSegundo();
					System.out.print("e"); medioSegundo();
					break;
				}
				case 2:{
					System.out.print("\n\n\t******** Felicidades :D ********");
					break;
				}
				case 3:{
					System.out.println("\n\n\t******** Guau guau xddxdxddxdxdxxddxdxdxx********");
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
//******* Chingue uste a su madre xdxdxddxddxdddx ********
}