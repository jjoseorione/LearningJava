public class HolaMundo {
    public static void main(String[] args){
        //Variable de tipo String. Los String son objetos.
        String saludar = "Hola a todo el mundo";
        //Se imprime saludar
        System.out.println(saludar);
        //Al ser un objeto, se puede invocar métodos en él. El método toUpperCase convierte todo
        //el texto a mayúsculas
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        //Consejo: con el atajo sout + TAB podemos escribir System.out.println
        //y si escribimos soutv + TAB podemos imprimir el valor de una variable

        //La palabra int sirve para declarar enteros
        int numero = 10;
        System.out.println("numero = " + numero);

        //Los booleanos se definen con la palabra boolean y sólo pueden contener true y false
        boolean valor = true;

        //Dentro del if se crea un nuevo contexto (o ámbito o alcance) de variables
        //Si se crea una variable dentro del if, sólo será visible dentro del if
        if(valor){
            //Dentro del if puedo imprimir a número porque sí es visible
            System.out.println("numero = " + numero);

            int numero2 = 10;
        }

        //Aquí no es visible numero2, debido a que se creó dentro del if
        //System.out.println("numero2 = " + numero2);

        var numero3 = 15;       //A partir de la versión 10 se agrega la definición dinámica de variables
        //Con var se infiere el tipo de la variable según el valor que se le está asignando. En este caso,
        //var sería un int

        var numero4 = "15";     //numero4 es un String


        //Clase 10
        String nombre;

        if(numero > 10 )
            nombre = "Andres";
        else
            nombre = "Emmanuel";

        System.out.println(nombre);

        //Si solo se asigna la variable en el if, el código no compila, debido a que podría
        //no asignarse un valor y se va a usar la variable. Debe de asignarse también en el else
    }
}
