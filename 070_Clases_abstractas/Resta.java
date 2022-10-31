public class Resta extends Operacion{
	private boolean n;

	public Resta(double x, double y){
		super(x, y);
		n = (x-y < 0);
	}
	public double operar(){
		return x-y;
	}
	public boolean esNegativo(){
		return n;
	}
}