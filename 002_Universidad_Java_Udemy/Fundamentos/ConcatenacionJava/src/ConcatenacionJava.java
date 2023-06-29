
public class ConcatenacionJava {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);  //Se realiza suma de números
        System.out.println(i + j + usuario);    //Se realiza primero la suma debido al orden de los operadores (el primer + indica suma)
        System.out.println(usuario + i + j);    //Se realiza primero la concatenación debido a que el primer + indica concatenación
        System.out.println(usuario + (i + j));  //Se realiza primero la suma por estar entre paréntesis y posteriormente se concatena
    }

}
