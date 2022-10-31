//Si descomentamos las lineas de try y catch o throws, el programa compila. Si están comentadas, el
//programa no compila por excepciones verificadas no manejadas por el programador

//Throws: We can use throws keyword to delegate the responsibility of exception handling 
//to the caller (It may be a method or JVM) then caller method is responsible to handle that 
//exception.  

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcepcionVerificada {
    public static void main(String[] ar) /*throws IOException*/ {
        //try {
            FileWriter fw = new FileWriter(new File("datos.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
            bw.close();
            fw.close();
        //} catch (IOException ex) {
        //    System.out.println("Problemas en la creación del archivo");
        //    System.out.println(ex.getMessage());
        //}
        //try {
            FileReader fr = new FileReader(new File("datos.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        //} catch (IOException ex) {
        //    System.out.println("Problemas con la lectura del archivo");
        //    System.out.println(ex.getMessage());
        //}
    }   
}