import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try{
            numeroDecimal = teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Debe introducir un numero entero");
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal en binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = numeroDecimal;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroBinario en octal = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = numeroDecimal;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numeroOctal en hexadecimal = " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        int numeroHex = numeroDecimal;
        System.out.println("numeroHex = " + numeroHex);


    }
}
