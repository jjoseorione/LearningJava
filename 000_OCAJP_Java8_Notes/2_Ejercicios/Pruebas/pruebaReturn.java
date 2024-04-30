public class pruebaReturn{
	public static void main(String... args){
		int i = 99;
		try{
			i = val();
		} catch (Exception e){
			System.out.println("Holi");
		}
	}

	static int val() throws Exception{
		throw new Exception("unimplemented");
	}
}