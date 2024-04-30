public class PruebaCastPolymorphism{
	public static void main(String... args){
		Object obj = Integer.valueOf(10);
		//int i = obj.intValue();		//no compila porque obj es declarado como Object
		int i = ((Integer) obj).intValue();		//funciona debido al cast
		System.out.println("i = " + i);
	}
}