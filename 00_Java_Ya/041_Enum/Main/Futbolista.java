package Main;

public class Futbolista{
	private int dorsal;
	private String nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista(){

	}

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo){
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	//@Override nos ayuda a que el compilador compruebe que se está realizando una sobreescritura de método. En caso de que no se esté realizando correctamente la sobreescritura, se nos avisará.
	@Override
	public String toString(){
		return this.dorsal + " - " + this.nombre + " - " + this.demarcacion.name() + " - " + this.equipo.getNombreClub();
	}
}