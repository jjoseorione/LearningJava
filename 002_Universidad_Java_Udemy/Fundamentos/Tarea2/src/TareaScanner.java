import java.util.Scanner;

public class TareaScanner {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo = teclado.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = teclado.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
