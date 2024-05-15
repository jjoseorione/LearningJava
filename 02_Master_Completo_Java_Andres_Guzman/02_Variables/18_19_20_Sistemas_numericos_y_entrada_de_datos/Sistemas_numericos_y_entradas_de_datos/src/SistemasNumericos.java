public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 47104;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal en binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b1011100000000000;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroBinario en octal = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 0134000;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numeroOctal en hexadecimal = " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        int numeroHex = 0xb800;
        System.out.println("numeroHex = " + numeroHex);

    }
}
