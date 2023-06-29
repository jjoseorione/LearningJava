//Se incluyen lecciones 15, 16

public class Main{
    public static void main(String[] args){
        /*Tipos en java:
        byte: 8 bits
        short: 16 bits
        int: 32 bits
        long: 64 bits
        */
        
        byte numeroByte = (byte)128;        //128 es más del valor máximo. Se imprime el equivalente a 128 en complemento a2
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte " + Byte.MIN_VALUE);
        System.out.println("Valos maximo byte " + Byte.MAX_VALUE);
        
        short numeroShort = (byte)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short " + Short.MIN_VALUE);
        System.out.println("Valor maximo short " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int " + Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775808D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long " + Long.MIN_VALUE);
        System.out.println("Valor maximo long " + Long.MAX_VALUE);
    }
}
