public class Prueba{
	public static void main(String[] args){
		System.out.print("\n\n\t" + Matematicas.suma(5,3));
		System.out.print("\n\n\t" + Matematicas.suma(58,23));
		System.out.print("\n\n\t" + Matematicas.resta(154,39));
		System.out.print("\n\n\t" + Matematicas.PI);
		System.out.print("\n\n\t" + Matematicas.areaCirculo(4.5));

		//Esta última línea no tiene nada que ver con el tema. Sólo quería experimentar si es posible
		//ejecutar el main de una clase desde otra clase y sí es posible. Recordemos que de 
		//igual forma el main es un
		//método estático
		Matematicas.main(null);
	}
}