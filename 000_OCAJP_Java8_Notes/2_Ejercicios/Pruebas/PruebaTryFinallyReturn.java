public class PruebaTryFinallyReturn{
	public static void main(String... args){
		System.out.println(m1());
	}

	static int m1(){
		int i = 10;
		try{
			i = 11;
			return i;
		}
		catch(Exception e){
			i = 12;
			return i;
		}
		finally{
			i = 13;
			System.out.println(i);
		}
	}
}