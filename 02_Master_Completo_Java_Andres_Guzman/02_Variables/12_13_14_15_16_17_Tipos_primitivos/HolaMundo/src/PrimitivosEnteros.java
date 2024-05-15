//Clase 12. Primitivos enteros
public class PrimitivosEnteros {
    public static void main(String[] args) {

        //byte tiene un rango de -128 a 127
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor mínimo de byte " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de byte " + Byte.MAX_VALUE);
        System.out.println("------------------------------------------------------");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("Valor mínimo de short " + Short.MIN_VALUE);
        System.out.println("Valor máximo de short " + Short.MAX_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor mínimo de int " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de int " + Integer.MAX_VALUE);

        long numeroLong = 9_223_372_036_854_775_807L;
        System.out.println("numeroLong = " + numeroInt);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("Valor mínimo de long " + Long.MIN_VALUE);
        System.out.println("Valor máximo de long " + Long.MAX_VALUE);

        var numeroVar = 127;        //Solo desde java 10. Se infiere el tipo de variable con base en el valor asignado.
    }
}
