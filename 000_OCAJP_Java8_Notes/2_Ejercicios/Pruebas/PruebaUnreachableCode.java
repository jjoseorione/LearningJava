//Conclusiones:
/* 	No hay fórmulas mágicas. Se tiene que analizar cada caso de manera cuidadosa. En términos
	generales:
		
		• Todos los bloques con false son unreachable code porque el código dentro del bloque
		es inalcanzable y esto ocurre aunque el ciclo no tenga instrucciones como while(false);
		o while(false){}

		• Los bloques con true son unreachable code sólo para el código que hay debajo del ciclo.
		Es decir, si se tiene un ciclo while(true) y no hay nada debajo, es posible compilarlo, ya
		que no hay código debajo que sea imposible ejecutar. De la misma manera, si el ciclo while(true)
		se encuentra dentro de un bloque try, el código dentro del bloque puede lanzar una excepción y
		ejecutar los bloques catch y/o finally. En cambio, si se tiene código dentro del try pero debajo
		del ciclo, ese código será inalcanzable.
*/



public class PruebaUnreachableCode{
	public static void main(String... args){
		int i = 0;
		//while con false y una instrucción. No compila. El código DENTRO del bloque es inalcanzable
		// while(false)
		// 	System.out.println("Hola");

		//while con false e instrucciones. No compila. El código DENTRO del bloque es inalcanzable
		// while(false){
		// 	System.out.println("Hola");
		// 	System.out.println("Adios");
		// }

		//while con false sin instrucciones. No compila. El código DENTRO del ciclo es inalcanzable (aunque esté vacío)
		// while(false);

		//while con true y una instrucción. No compila. El código DESPUÉS del ciclo es inalcanzable.
		// while(true)
		// 	System.out.println("Hola");

		//while con true e instrucciones. No compila. El código DESPUÉS del ciclo es inalcanzable.
		// while(true){
		// 	System.out.println("Hola");
		// 	System.out.println("Adios");
		// 	i++;
		// }

		//while con true sin instrucciones. No compila. El código DESPUÉS del ciclo es inalcanzable.
		// while(true);



		//while con false en la condición y bloque try/catch. No compila. El código DENTRO del bloque es inalcanzable
		// try{
		// 	i++;
		// 	while(false)
		// 	 	System.out.println("Hola");
		// 	i++;
		// }
		// catch(Throwable t){
		// 	System.out.println("Hola");
		// }

		//while con false en la condición y bloque try/catch. Compila si no hay nada debajo del while dentro del try
		try{
			i++;
			while(true)
			 	System.out.println("Hola");
			// i++;
		}
		catch(Throwable t){
			System.out.println("Hola");
		}






		System.out.println("Terminado");

		// while(true)
		// 	i++;

	}
}