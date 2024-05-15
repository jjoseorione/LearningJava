public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 2.12e3f;  //Notación científica para 2120
        float realFloat1 = 1.5e-4f; //Notación científica para 0.00015
        float realFloat2 = 0.00015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat1 = " + realFloat1);
        System.out.println("realFloat2 = " + realFloat2);

        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor mínimo de float " + Float.MIN_VALUE);
        System.out.println("Valor máximo de float " + Float.MAX_VALUE);

        double realDoble = 3.5E38;
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("Valor mínimo de double " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double " + Double.MAX_VALUE);

    }
}
