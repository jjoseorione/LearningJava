public class main {

    public static void main(String[] args) {
        char caracter = '!';    //Se utliza comilla simple para los caracteres
        System.out.println("caracter = " + caracter);
        
        char caracter1 = '\u0021';   //Ejemplo de caracter unicode
        System.out.println("caracter1 = " + caracter1);
        
        char caracter2 = 33;   //Ejemplo de caracter unicode con inferencia de tipos
        System.out.println("caracter2  = " + caracter2);
        
        var caracter3 = '!';    //Caracter con inferencia de tipos
        System.out.println("caracter3 = " + caracter3);
        
        var caracter4 = '\u0021';   //Ejemplo de caracter unicode con inferencia de tipos
        System.out.println("caracter4 = " + caracter4);
        
        var caracter5 = 33;   //Ejemplo de caracter unicode con inferencia de tipos. Se infiere entero
        System.out.println("caracter5  = " + caracter5);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
    }
    
}
