class Radio{
	private double frequency = 1.1;	//Insertar getters y setters apropiados

	public double getFrequency(){
		return this.frequency;
	}
	public void setFrequency(double frequency){
		this.frequency = frequency;
	}
}

class TV{
	private int channel = 5;	//Insertar getters y setters apropiados

	public int getChannel(){
		return this.channel;
	}
	public void setChannel(int channel){
		this.channel = channel;
	}
}

public class TestClass{
	public static void main(String[] args){
		TV t = new TV();
		Radio r = new Radio();
		reset(t);
		reset(r);
		System.out.println(r.getFrequency());	//Debe imprimir 0.0
		System.out.println(t.getChannel());		//Debe imprimir 0
	}

	public static void reset(Object algo){
		if(algo instanceof TV)
			((TV) algo).setChannel(0);
		else if(algo instanceof Radio)
			((Radio) algo).setFrequency(0);
	}
}