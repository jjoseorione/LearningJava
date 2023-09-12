public class pruebaInicializadores{
	public String id = "1";

	{
		//id = "2";
	}

	public pruebaInicializadores(){
		//id = "3";
		System.out.println("En constructor");
	}

	public static void main(String[] args){
		pruebaInicializadores pi = new pruebaInicializadores();
		System.out.println(pi.id);
	}
}