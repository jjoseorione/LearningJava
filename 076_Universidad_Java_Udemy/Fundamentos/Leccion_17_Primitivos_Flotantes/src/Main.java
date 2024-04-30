
public class Main {
    public static void main(String[] args){
        /*
        Tipos primitivos en java:
        float: de 32 bits
        double: de 64 bits

        A pesar de tener el mismo número de bits de los int y long, los números de
        punto flotante pueden guardar números más grandes debido a que utilizan formato
        exponencial

        */
    
        float numeroFloat = (float)3.4028236E38d;        //Las constantes de punto flotante se guardan por default como double
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623158E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        
        
        
    }
}
