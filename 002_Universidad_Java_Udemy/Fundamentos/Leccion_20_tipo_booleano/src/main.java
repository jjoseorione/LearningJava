
public class main {

    public static void main(String[] args) {
        boolean variableBooleana = false;
        System.out.println("variableBooleana = " + variableBooleana);
        if(variableBooleana){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        if(esAdulto)
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");
    }
    
}
