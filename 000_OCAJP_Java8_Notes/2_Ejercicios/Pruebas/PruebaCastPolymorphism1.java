class Base{
	void m1(){
		System.out.println("En Base");
	}
}

class HijaA extends Base{
	void m1(){
		System.out.println("En HijaA");
	}
}

class HijaB extends HijaA{
	void m1(){
		System.out.println("En HijaB");
	}
}


public class PruebaCastPolymorphism1{
	public static void main(String[] args){
		Base b2 = new HijaA();
		Base b1 = (Base) b2;
		b2.m1();		//Deberia imprimir HijaA
		b1.m1();		//Debería imprimir HijaA
		Base b3 = new HijaB();
		((Base) b3).m1();		//Debería imprimir HijaB
		((HijaA) b3).m1();		//Debería imprimir HijaB
		((Base) (HijaA) b3).m1();		//Debería imprimir HijaB
	}
}