//super sin paréntesis es una palabra clave que nos permite acceder a los métodos y propiedades de la clase padre.
//super con paréntesis es una palabra clave que nos permite ejecutar el constructor de la clase padre.
//this sin paréntesis es una palabra clave que nos permite acceder a los métodos y propiedades de la propia clase.
//this con paréntesis es una palabra clave que nos permite llamar a otro constructor de la propia clase, diferente del constructor desde el que se ha invocado.

public class Prueba{
	public static void main(String[] args){
		Suma s1 = new Suma();
		Suma s2 = new Suma(5,6);
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