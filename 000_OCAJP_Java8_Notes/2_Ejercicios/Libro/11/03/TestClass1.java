interface Device{
	public void reset();
}

class Radio implements Device{
	private double frequency = 1.1;	//Insertar getters y setters apropiados

	public double getFrequency(){
		return this.frequency;
	}
	public void setFrequency(double frequency){
		this.frequency = frequency;
	}
	public void reset(){
		this.frequency = 0.0;
	}
}

class TV implements Device{
	private int channel = 5;	//Insertar getters y setters apropiados

	public int getChannel(){
		return this.channel;
	}
	public void setChannel(int channel){
		this.channel = channel;
	}
	public void reset(){
		this.channel = 0;
	}
}

class Dvd implements Device{
	private float region = (float) 100.101;		//No compila sin cast

	public float getRegion(){
		return this.region;
	}
	public void setFrequency(float region){
		this.region = region;
	}
	public void reset(){
		this.region = 0;
	}
}

public class TestClass1{
	public static void main(String[] args){
		TV t = new TV();
		Radio r = new Radio();
		Dvd dvd = new Dvd();
		reset(t);
		reset(dvd);
		reset(r);
		System.out.println(r.getFrequency());	//Debe imprimir 0.0
		System.out.println(dvd.getRegion());	//Debe imprimir 0.0
		System.out.println(t.getChannel());		//Debe imprimir 0
		System.out.println("Se logro");
	}

	public static void reset(Device d){
		d.reset();
	}
}