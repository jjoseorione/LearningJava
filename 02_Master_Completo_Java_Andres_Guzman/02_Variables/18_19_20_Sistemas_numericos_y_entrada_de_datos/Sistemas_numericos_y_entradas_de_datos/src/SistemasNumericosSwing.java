import javax.swing.*;

public class SistemasNumericosSwing {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe introducir un numero entero");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "numeroDecimal = " + numeroDecimal);
        JOptionPane.showMessageDialog(null, "numeroDecimal en binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = numeroDecimal;
        JOptionPane.showMessageDialog(null, "numeroBinario = " + numeroBinario);
        JOptionPane.showMessageDialog(null, "numeroBinario en octal = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = numeroDecimal;
        JOptionPane.showMessageDialog(null, "numeroOctal = " + numeroOctal);
        JOptionPane.showMessageDialog(null, "numeroOctal en hexadecimal = " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        int numeroHex = numeroDecimal;
        JOptionPane.showMessageDialog(null, "numeroHex = " + numeroHex);


    }
}
