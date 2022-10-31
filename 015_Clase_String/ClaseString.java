import java.util.Scanner;

public class ClaseString{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String s1 = "", s2 = "";
		int r, x, y;
		do{
			System.out.print("\n\n\tEjemplo de clase String. Seleccione una opcion del menu.\n");
			System.out.print("\n\t1. Ingresar/cambiar s1");
			System.out.print("\n\t2. Ingresar/cambiar s2");
			if(s1 != "" && s2 != ""){
				System.out.print("\n\t3. s1.equals(s2)");
				System.out.print("\n\t4. s1.equalsIgnoreCase(s2)");
				System.out.print("\n\t5. s1.compareTo(s2)");
				System.out.print("\n\t6. s1.charAt(x)");
				System.out.print("\n\t7. s1.length()");
				System.out.print("\n\t8. s1.substring(x,y)");
				System.out.print("\n\t9. s1.indexOf(s2)");
				System.out.print("\n\t10. s1.toUpperCase()");
				System.out.print("\n\t11. s1.toLowerCase()");
				System.out.print("\n\tIngrese 0 para salir");
			}
			System.out.print("\n\n\t\tR: ");
			r = teclado.nextInt();
			if (r == 1){
				System.out.print("\n\t\ts1: ");
				s1 = teclado.next();
			}
			else if (r == 2){
				System.out.print("\n\t\ts2: ");
				s2 = teclado.next();
			}
			else if(r == 3 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.equals(s2));
			else if(r == 3)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 4 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.equalsIgnoreCase(s2));
			else if(r == 4)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 5 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.compareTo(s2));
			else if(r == 5)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 6 && s1 != "" && s2 != ""){
				System.out.print("\n\n\tx: ");
				x = teclado.nextInt();
				System.out.print("\n\t\t" + s1.charAt(x));
			}
			else if(r == 6)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 7 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.length());
			else if(r == 7)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 8 && s1 != "" && s2 != ""){
				System.out.print("\n\n\tx: ");
				x = teclado.nextInt();
				System.out.print("\ty: ");
				y = teclado.nextInt();
				System.out.print("\n\t\t" + s1.substring(x,y));
			}
			else if(r == 8)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 9 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.indexOf(s2));
			else if(r == 9)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 10 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.toUpperCase());
			else if(r == 10)
				System.out.print("\n\tOpcion invalida.");
			else if(r == 11 && s1 != "" && s2 != "")
				System.out.print("\n\t\t" + s1.toLowerCase());
			else if(r == 11)
				System.out.print("\n\tOpcion invalida.");

			else if (r == 0)
				System.out.print("\n\n\tHasta la vista");
			else
				System.out.print("\n\tOpcion invalida.");

		}
		while (r != 0);
		
	}
}