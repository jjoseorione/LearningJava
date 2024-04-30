public class PruebaAlcanceTryCatchFinally{
	public static void main(String[] args){
		try{
			int a = 10;
			throw new Throwable();
		}
		catch(Exception e){
			System.out.println(a);	//No compila porque a no está definida aquí
			int b = 20;
		}
		catch(Throwable t){
			System.out.println(a);	//No compila porque a no está definida aquí
			System.out.println(b);	//No compila porque b no está definida aquí
			int c = 30;
		}
		finally{
			System.out.println(a);	//No compila porque a no está definida aquí
			System.out.println(b);	//No compila porque b no está definida aquí
			System.out.println(c);	//No compila porque c no está definida aquí
			int d = 40;
		}
		System.out.println(a);	//No compila porque a no está definida aquí
		System.out.println(b);	//No compila porque b no está definida aquí
		System.out.println(c);	//No compila porque c no está definida aquí
		System.out.println(d);	//No compila porque d no está definida aquí
	}
}