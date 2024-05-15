public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\ufd3f';   //La notación uXXXX es en hexadecimal
        char caracter1 = 64831;     //La notación con números es decimal
        char caracter2 = '﴿';
        boolean igual = caracter == caracter1;  //Ambas variables contienen el mismo caracter
        boolean igual1 = caracter == caracter2; //También contiene lo mismo;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter1 = " + caracter1);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("igual = " + igual);
        System.out.println("igual1 = " + igual1);

        System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("Valor mínimo de char " + Character.MIN_VALUE);
        System.out.println("Valor máximo de char " + Character.MAX_VALUE);

        //Caracteres especiales. Pueden ser útiles para dar formato en la consola

        char espacio = '\u0020';
        char retroceso = '\b';  //backspace: borra el último caracter
        char tabulador = '\t';  //tabulador
        char nuevaLinea = '\n';
        char retornoDeCarro = '\r';

        System.out.println("Hola a todos" + retroceso + retroceso);
        System.out.println("Hola a todos" + retornoDeCarro + "Nos vemos");  //El resultado del retorno de carro depende del SO

    }
}
