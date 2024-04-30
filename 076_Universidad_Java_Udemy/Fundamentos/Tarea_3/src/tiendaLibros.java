
import java.util.Scanner;

public class tiendaLibros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(teclado.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        boolean envio = Boolean.parseBoolean(teclado.nextLine());
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);
    }
    
}
