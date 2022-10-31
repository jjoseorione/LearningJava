public class Suma extends Operacion{
	public Suma(int x, int y){
		super(x, y);
	}
	public Suma(){
		super();
	}
	public void operar(){
		r = x + y;
	}
}