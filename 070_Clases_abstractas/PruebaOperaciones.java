public class PruebaOperaciones{
	public static void main(String[] args){
		Suma s1 = new Suma(9.2, 4.56);
		Suma s2 = new Suma(3.33, 3.9);
		Resta r1 = new Resta(9, 12);
		Resta r2 = new Resta(79.45, 32.992);
		Resta r3 = new Resta(19.45, 19.45);
		Division d1 = new Division(3.5, 1.2);
		Division d2 = new Division(50, 2.5);

		System.out.print("\n" + s1.operar());
		System.out.print("\n" + s2.operar());
		System.out.print("\n" + r1.operar());
		System.out.print("\n" + r1.esNegativo());
		System.out.print("\n" + r2.operar());
		System.out.print("\n" + r2.esNegativo());
		System.out.print("\n" + r3.operar());
		System.out.print("\n" + r3.esNegativo());
		System.out.print("\n" + d1.operar());
		System.out.print("\n" + d1.mod());
		System.out.print("\n" + d2.operar());
		System.out.print("\n" + d2.mod());
	}
}