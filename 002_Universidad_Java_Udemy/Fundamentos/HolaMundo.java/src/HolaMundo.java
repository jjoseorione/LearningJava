//Lecciones contenidas:
//5. Hola mundo
//7. Variables en Java
//8. Tipos Enteros y Tipo String
//9. Palabra var

public class HolaMundo{
    public static void main(String[] args){
        System.out.println("Hola mundo. Otra vez.");
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var es una inferencia de tipos. Existe a partir de la versión 10.
        //Con var java va a inferir el tipo según el valor asignado.
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "K pdo";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
}