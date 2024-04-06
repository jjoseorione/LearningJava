interface Device{
	public Number getFrequency();
	public void setFrequency(Number frequency);
}

class Radio implements Device{
	private double frequency = 1.1;	//Insertar getters y setters apropiados

	public Double getFrequency(){
		return Double.valueOf(this.frequency);
	}
	public void setFrequency(Number frequency){
		this.frequency = frequency.doubleValue();
	}
}

class TV implements Device{
	private int frequency = 5;	//Insertar getters y setters apropiados

	public Integer getFrequency(){
		return Integer.valueOf(this.frequency);
	}
	public void setFrequency(Number frequency){
		this.frequency = frequency.intValue();
	}
}

class Dvd implements Device{
	private float frequency = (float) 100.101;		//No compila sin cast

	public Float getFrequency(){
		return Float.valueOf(this.frequency);
	}
	public void setFrequency(Number frequency){
		this.frequency = frequency.floatValue();
	}
}

public class TestClass{
	public static void main(String[] args){
		TV t = new TV();
		Radio r = new Radio();
		Dvd dvd = new Dvd();
		reset(t);
		reset(dvd);
		reset(r);
		System.out.println(r.getFrequency());	//Debe imprimir 0.0
		System.out.println(dvd.getFrequency());	//Debe imprimir 0.0
		System.out.println(t.getFrequency());		//Debe imprimir 0
		System.out.println("Se logro");
	}

	public static void reset(Device d){
		d.setFrequency(Integer.valueOf(0));
	}
}