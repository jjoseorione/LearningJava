public abstract class Operacion{
	protected double x;
	protected double y;

	public Operacion(double x, double y){
		this.x = x;
		this.y = y;
	}

	public abstract double operar();
}