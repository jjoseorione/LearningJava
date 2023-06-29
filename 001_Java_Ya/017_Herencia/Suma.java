//Clase hija de Operación. Se crea con la palabra extends.
//El método super() es una llamada al constructor de la clase padre.
public class Suma extends Operacion{
	//Prueba de modificadores de acceso
	public Suma(int x, int y){
		super(x, y);
	}
	public Suma(){
		super();
		// this.pruebaPrivate = true; // Esta línea genera error por modificador de acceso privado
		this.pruebaPublic = true;
		this.pruebaProtected = true;
	}
	public void operar(){
		r = x + y;
	}
}