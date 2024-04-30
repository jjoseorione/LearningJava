//import java.lang.Number;

interface Device{
	public void reset();
	public Number getParam();
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

	public Double getParam(){
		return this.getFrequency();
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
	public Integer getParam(){
		return this.getChannel();
	}
}

class Dvd implements Device{
	private float region = (float) 100.101;		//No compila sin cast

	public float getRegion(){
		return this.region;
	}
	public void setRegion(float region){
		this.region = region;
	}
	public void reset(){
		this.region = 0;
	}
	public Float getParam(){
		return this.getRegion();
	}
}

class Stereo implements Device{
	private short volume = (short) 420;

	public void setVolume(short volume){
		this.volume = volume;
	}

	public short getVolume(){
		return this.volume;
	}

	public void reset(){
		this.volume = 0;
	}

	public Short getParam(){
		return this.getVolume();
	}
}

public class TestClass1{
	public static void main(String[] args){
		Device[] devices = new Device[4];
		devices[0] = new TV();
		devices[1] = new Radio();
		devices[2] = new Dvd();
		devices[3] = new Stereo();
		for( Device d : devices)
			TestClass1.reset(d);
		for( Device d : devices)
			System.out.println(d.getParam());

		System.out.println("Se logro");
	}

	public static void reset(Device d){
		d.reset();
	}
}