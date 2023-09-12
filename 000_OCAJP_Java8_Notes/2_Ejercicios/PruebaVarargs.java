public class PruebaVarargs{
	public static double average(int... values){
		float sum = 0;
		for(int i = 0; i < values.length; i++) sum += values[i];
		return values.length == 0 ? 0 : sum/values.length;
	}
	public static void main(String[] args){
		int[] numeros = {8, 9, 8, 7, 7, 7};
		System.out.println(average(numeros));
	}
}