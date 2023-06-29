
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("Escribe el título: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + nombre);
    }
}
