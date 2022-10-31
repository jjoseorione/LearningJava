public class Resta extends Operacion{
	public Resta(){
		super();
	}
	public Resta(int x, int y){
		super(x, y);
	}
	public void operar(){
		r = x - y;
	}
}