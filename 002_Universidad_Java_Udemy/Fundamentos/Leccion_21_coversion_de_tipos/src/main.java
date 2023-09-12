
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        var edad1 = "20";
        System.out.println("edad = " + (edad + 1));
        System.out.println("edad1 = " + (edad1 + 1));
        
        var valorPI = Double.parseDouble("3.141592");
        System.out.println("valorPI = " + valorPI);
        System.out.println("valorPI = " + (valorPI + 1));
        
        //Pedir un valor con Scanner
        var teclado = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        //Convertir la edad en entero
        edad = Integer.parseInt(teclado.nextLine());
        System.out.println("Tu edad es " + edad);
        System.out.println("Dentro de un año tendras " + (edad+1));
        
        //Convertir entero a String
        String edadTexto = String.valueOf(edad);
        System.out.println("Dentro de un año tendras " + (edadTexto+1));
        
        //Obtener un caracter de un String
        char caracter = "Hola".charAt(teclado.nextInt());
        System.out.println("caracter: " + caracter);
    }
    
}
