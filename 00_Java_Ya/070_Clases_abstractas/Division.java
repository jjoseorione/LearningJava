public class Division extends Operacion{
	public Division(double x, double y){
		super(x, y);
	}
	public double operar(){
		return x/y;
	}
	public double mod(){
		return x % y;
	}
}