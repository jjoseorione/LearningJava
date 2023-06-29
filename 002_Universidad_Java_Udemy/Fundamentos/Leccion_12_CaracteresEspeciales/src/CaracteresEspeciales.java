
public class CaracteresEspeciales {
    public static void main(String[] args){
        //Caracteres especiales (de escape)
        var nombre = "Karla";
        
        System.out.println("Nueva línea: \n" + nombre);
        System.out.println("Tabulador: \t"  + nombre);
        System.out.println("Retroceso: \b" + nombre);   //Se retrocede un espacio
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
