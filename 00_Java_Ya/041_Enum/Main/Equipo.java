package Main;
/*
	Como ya se ha dicho, un enum es una clase especial que limita la creación de objetos a los especificados en su clase (por eso su constructor es privado); pero estos objetos pueden tener atributos como cualquier otra clase. A continuación tenemos un enum al que llamamos "Equipo" que va a tener dos atributos: el nombre y el puesto en el que quedaron en LaLiga en la temporada 2021/2022.

	Como puede observarse, BARCELONA, REAL_MADRID, etc. con el nombre del enumerado (u objetos de la clase Equipo) que tendrán como atributos nombreClub y puestoLiga. Como se ve en la clase, se define un constructor privado (sólo es visible dentro de la clase Equipo) y sólo se definen los métodos get. Para trabajar con los atributos de estos enumerados, se hace de la misma manera que con cualquier otroobjeto; se instancia un objeto y se accede a los atributos con los métodos get.
*/
public enum Equipo{

	REAL_BETIS("Real Betis Balompié", 5),
	BARCELONA("Fútbol Club Barcelona", 2),
	REAL_MADRID("Real Madrid Club de Fútbol", 1), 
	SEVILLA("Sevilla Fútbol Club", 4),
	ATLETICO_MADRID("Club Atlético de Madrid", 3);

	private String nombreClub;
	private int puestoLiga;

	private Equipo(String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub(){
		return nombreClub;
	}

	public int getPuestoLiga(){
		return puestoLiga;
	}


}

/*Es muy importante tener claro que los enums no son simplemente Strings (aunque pueden serlo), sino que son objetos de una clase que sólo son intanciables desde la clase que se implementa y que no puede crear un objeto de esa clase desde cualquier otro lado que no sea dentro de esa clase. Es muy común (sobre todo cuando se está aprendiendo acerca de enums) que se interprete que un enumerado es una lista finita de Strings y en realidad es una lista finita de objetos de una determinada clase con sus atributos, constructor y métodos get, aunque estos sean privados*/