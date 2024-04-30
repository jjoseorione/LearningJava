import Main.*;

public class Prueba{
	public static void pruebaDemarcacion(){
		Demarcacion cristianoRonaldo = Demarcacion.DELANTERO;
		Demarcacion virgilVanDijk = Demarcacion.DEFENSA;
		Demarcacion manuelNeuer = Demarcacion.PORTERO;
		Demarcacion thomasMuller = Demarcacion.DELANTERO;

		System.out.println("cristianoRonaldo.name(): " + cristianoRonaldo.name());
		System.out.println("virgilVanDijk.name(): " + virgilVanDijk.name());

		System.out.println("cristianoRonaldo.toString(): " + cristianoRonaldo.toString());
		System.out.println("virgilVanDijk.toString(): " + virgilVanDijk.toString());

		System.out.println("cristianoRonaldo.ordinal(): " + cristianoRonaldo.ordinal());
		System.out.println("virgilVanDijk.ordinal(): " + virgilVanDijk.ordinal());

		System.out.println("cristianoRonaldo.compareTo(manuelNeuer): " + cristianoRonaldo.compareTo(manuelNeuer));
		System.out.println("virgilVanDijk.compareTo(manuelNeuer): " + virgilVanDijk.compareTo(manuelNeuer));

		System.out.println(cristianoRonaldo == thomasMuller);
		//Sólo hay un objeto delantero, así que thomasMuller y cristianoRonaldo apuntan al mismo objeto
	}

	public static void pruebaEquipo(){
		//Instanciamos un enumerado
		Equipo barcelona = Equipo.BARCELONA;

		//Devuelve un String con el nombre de la constante
		System.out.println("barcelona.name() = " + barcelona.name());

		//Devuelve el contenido de los atributos
		System.out.println("barcelona.getNombreClub() = " + barcelona.getNombreClub());
		System.out.println("barcelona.getPuestoLiga() = " + barcelona.getPuestoLiga());
	}

	public static void pruebaFutbolista(){
		Futbolista casillas = new Futbolista("Iker Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
		Futbolista pique = new Futbolista("Gerard Piqué", 3, Demarcacion.DEFENSA, Equipo.BARCELONA);
		Futbolista puyol = new Futbolista("Carles Puyol", 5, Demarcacion.DEFENSA, Equipo.BARCELONA);
		Futbolista iniesta = new Futbolista("Andrés Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BARCELONA);
		Futbolista xavi = new Futbolista("Xavi Hernández", 8, Demarcacion.CENTROCAMPISTA, Equipo.BARCELONA);
		Futbolista alonso = new Futbolista("Xabi Alonso", 14, Demarcacion.CENTROCAMPISTA, Equipo.REAL_MADRID);
		Futbolista ramos = new Futbolista("Sergio Ramos", 15, Demarcacion.DEFENSA, Equipo.REAL_MADRID);
		Futbolista navas = new Futbolista("Jesús Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA);
		
		System.out.println(casillas.toString());
		System.out.println(pique.toString());
		System.out.println(puyol.toString());
		System.out.println(iniesta.toString());
		System.out.println(xavi.toString());
		System.out.println(alonso.toString());
		System.out.println(ramos.toString());
		System.out.println(navas.toString());

	}

	public static void main(String[] args){
		//pruebaDemarcacion();
		//pruebaEquipo();
		pruebaFutbolista();
	}
}	