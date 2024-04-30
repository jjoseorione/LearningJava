public class PruebaClaseAnonima{
	public static void main(String... args){
		Abstracta anon = new Abstracta(5){
		//Inter anon = new Inter(){
			String name = "Clase anónima";
			//int num = 5;

			@Override
			public String toString(){
				return "" +
					"\nname = " + name +
					"\nnum = " + num;
			}
		};
		System.out.println(anon);
	}
}

abstract class Abstracta{
	int num;
	Abstracta(int num){
		this.num = num;
	}
}

interface Inter{

}

/*Conclusión: Una clase anónima siempre requiere lo siguiente:
	• El operador new
	• El nombre del interfaz que se implementa o de la clase de la que se hereda.
	• Paréntesis que pueden contener los argumentos de un constructor, como cualquier 
	instancia de una clase normal. Nota: Cuando implementas un interfaz, no hay 
	constructor, por tanto usaremos un par de paréntesis vacíos.
	• Un cuerpo, que es el cuerpo declarado de una clase. Específicamente, en el cuerpo,
	las declaraciones de métodos están permitidas pero las sentencias no.
	• No se puede declarar un constructor en una clase anónima. En su lugar se utiliza 
	el constructor heredado por la clase padre.
*/