public class PruebaForAnidado{
	public static void main(String[] args){
		CICLO_I:
		for(int i = 0; i<10; i++){
			for (int j = 0; j < 10; j++){
				System.out.println("i = " + i + " j = " + j);
				if(i == 4 && j == 5)
					break CICLO_I;
			}
		}
	}
} 