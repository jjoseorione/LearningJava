class InstanceCounter{
	static int count;
	InstanceCounter(){
		count++;
	}

	static void printCount(){
		System.out.println(count);
	}

	void reduceCount(){
		count--;
	}
}

public class PruebaStatic{
	public static void main(String[] args){
		InstanceCounter ic = new InstanceCounter();
		ic.printCount();	//Imprime 1
		new InstanceCounter().printCount();		//Imprime 2

		System.out.println(InstanceCounter.count);		//Imprime 2

	}
}