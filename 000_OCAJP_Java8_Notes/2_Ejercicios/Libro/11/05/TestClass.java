class Nutricionist{		//Solución incorrecta
	public void printCalories(Pie p){
		if(p instanceof ApplePie)
			System.out.println( ( (ApplePie) p ).getCalories());
		else if(p instanceof PumpkinPie)
			System.out.println( ( (PumpkinPie) p ).getCalories());
		else
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