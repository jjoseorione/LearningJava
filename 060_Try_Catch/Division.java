import java.util.Scanner;
import java.util.InputMismatchException;

public class Division{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.print("\tx: ");
			float x = teclado.nextFloat();
			System.out.print("\ty: ");
			float y = teclado.nextFloat();
			float z = x/y;
			System.out.print("\tx/y = " + z);
		}
		catch(InputMismatchException ex1){
			System.out.print("\n\n\tSólo se admiten números reales");
		}
		catch (ArithmeticException ex2) {
            System.out.println("\n\n\tNo se puede dividir por cero");
        }		
	}
}