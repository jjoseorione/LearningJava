//Esta solución es la correcta. La de TestClass no es una buena solución, ya que
//no hace uso de los beneficios del polimorfismo. Recordemos que el método de instancia
//ejecuta en un objeto corresponde al del objeto que se tiene en tiempo de 
//ejecución, y no al de la variable declara. De esta manera, en Nutricionist no es
//necesario filtrar qué tipo de Pie se tiene, sólo basta con llamar al método getCalories
//y se ejecutará el método del objeto contenido por la variable p.

class Nutricionist{
	public void printCalories(Pie p){
		System.out.println( p.getCalories());
	}
}

class Pie{
	public void makePie(){
		System.out.println("Making pie...");
	}
	public static int getCalories(){
		return 100;
	}
}

class PumpkinPie extends Pie{
	public void makePie(){
		super.makePie();
		System.out.println("Type of pie: Pumpkin");
	}
	public static int getCalories(){
		return 120;
	}
}

class ApplePie extends Pie{
	public void makePie(){
		super.makePie();
		System.out.println("Type of pie: Apple");
	}
	public static int getCalories(){
		return 110;
	}
}

public class TestClass{
	public static void main(String[] args){
		PumpkinPie pp = new PumpkinPie();
		pp.makePie();
		System.out.println();

		ApplePie ap = new ApplePie();
		ap.makePie();
		System.out.println();

		Pie p = new Pie();
		p.makePie();
		System.out.println();

		Nutricionist n = new Nutricionist();
		n.printCalories(pp);
		n.printCalories(ap);
		n.printCalories(p);
	}
}