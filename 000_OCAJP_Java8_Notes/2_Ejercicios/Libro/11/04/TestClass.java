class Pie{
	public void makePie(){
		System.out.println("Making pie...");
	}
}

class PumpkinPie extends Pie{
	public void makePie(){
		super.makePie();
		System.out.println("Type of pie: Pumpkin");
	}
}

class ApplePie extends Pie{
	public void makePie(){
		super.makePie();
		System.out.println("Type of pie: Apple");
	}
}

public class TestClass{
	public static void main(String[] args){
		PumpkinPie pp = new PumpkinPie();
		pp.makePie();
		System.out.println();
		ApplePie ap = new ApplePie();
		ap.makePie();
	}
}