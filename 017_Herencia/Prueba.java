public class Prueba{
	public static void main(String[] args){
		Suma s2 = new Suma(5,6);
		Suma s1 = new Suma();
		Resta r1 = new Resta();
		Resta r2 = new Resta(10,8);

		s1.operar();
		s2.operar();
		r1.operar();
		r2.operar();

		s1.imprimir();
		s2.imprimir();
		r1.imprimir();
		r2.imprimir();

	}
}