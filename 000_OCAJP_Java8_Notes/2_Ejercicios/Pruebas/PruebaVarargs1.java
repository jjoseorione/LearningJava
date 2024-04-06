public class PruebaVarargs1{
	public static double promedio1(int... valores){
		double sum = 0;
		for( int v : valores) {
			sum+=v;
			System.out.println("Promedio1: Sumando " + v);
		}
		return valores.length == 0 ? 0 : sum / valores.length;
	}

	public static double promedio2(int[] valores){
		double sum = 0;
		for( int v : valores){
			 sum+=v;
			System.out.println("Promedio2: Sumando " + v);

		}
		return valores.length == 0 ? 0 : sum / valores.length;
	}

	public static void main(String[] args){
		double promedio;
		int[] v = {3 , 5 , 9 , 1};
		promedio = promedio1(3 , 5 , 9 , 1);		//varargs
		//promedio = promedio1(v);					//varargs con array
		//promedio = promedio1();					//varargs vacío
		//promedio = promedio1(null);				//varargs null, genera NullPointerException
		System.out.println("Promedio1: " + promedio);
		
		//promedio = promedio2(v);			//array
		//promedio = promedio2();			//array vacío, no compila debido a que no recibe argumento
		promedio = promedio2(null);			//array con null, genera NullPointerException
		System.out.println("Promedio2: " + promedio);

	}
}