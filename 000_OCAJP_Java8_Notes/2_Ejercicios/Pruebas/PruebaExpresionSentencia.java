//Un método es una setencia siempre, aunque devuelva un valor y este valor no
//sea asignado o utilizado en una expresión.

public class PruebaExpresionSentencia{
	public static void main(String[] args){
		int i = 10;
		boolean b = true;
		String s = "Hola";

		i();
		b();
		s();
	}

	public static int i(){
		return 10;
	}
	public static boolean b(){
		return true;
	}
	public static String s(){
		return "Hola";
	}
}