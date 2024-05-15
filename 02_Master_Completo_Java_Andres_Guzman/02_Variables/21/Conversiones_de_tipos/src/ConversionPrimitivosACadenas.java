public class ConversionPrimitivosACadenas {
    public static void main(String[] args) {
        int numeroInt = 100;

        String strNumeroInt = Integer.toString(numeroInt);
        String strNumeroInt1 = String.valueOf(numeroInt);

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("strNumeroInt = " + strNumeroInt);
        System.out.println("strNumeroInt1 = " + strNumeroInt1);

        double numeroReal = 2750.584e-3;

        String strNumeroReal = Double.toString(numeroReal);
        String strNumeroReal1 = String.valueOf(numeroReal);

        System.out.println("numeroReal = " + numeroReal);
        System.out.println("strNumeroReal = " + strNumeroReal);
        System.out.println("strNumeroReal1 = " + strNumeroReal1);
    }
}
