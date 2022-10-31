/*Una clase abstracta es practicamente identica a una clase convencional; las clases abstractas 
pueden poseer atributos, métodos, constructores, etc ... La principal diferencia entre una clases 
convencional y una clase abstracta es que la clase abstracta debe poseer por lo menos un método 
abstracto. Ok, pero ahora, ¿ Qué es un método abstracto? Verás, un método abstracto no es más que 
un método vacío, un método el cual no posee cuerpo, por ende no puede realizar ninguna acción. La 
utilidad de un método abstracto es definir qué se debe hacer pero no el cómo se debe hacer.

Dentro de la clase encontramos el método área, método que se encuentra pensado para obtener el 
área de cualquier figura, sin embargo cómo sabemos todas las figuras poseen su propia fórmula 
matemática para calcular su área. Si yo comienzo a heredar de la clase Figura todas las clases 
hijas tendrían que sobre escribir el método área e implementar su propia formula para así poder 
calcular su área. En estos casos, en los casos la clase hija siempre deba que sobreescribir el 
método lo que podemos hacer es convertir al método convencional en un método abstracto, un método 
que defina qué hacer, pero no cómo se deba hacer.

Es importante mencionar que las clases abstractas pueden ser heredadas por la n cantidad de 
clases que necesitemos, pero no pueden ser instanciadas. Para heredar de una clase abstracta basta 
con utilizar la palabra reservada extends.

Al nosotros heredar de una clase abstracta es obligatorio implementar todos sus métodos abstractos, 
es decir debemos definir comportamiento, definir cómo se va a realizar la tarea.*/

public abstract class Figura{
	private String color;

	public Figura(String color){
		this.color = color;
	}

	public abstract double calcularArea();

	public String getColor(){
		return color;
	}
}