package Main;

/*
	Un enum es una clase "especial" tanto en Java como en otros lenguajes, que limitan la creación de objetos a los especificados 
	explícitamente en la implementación de la clase. La única limitación que tienen respecto a una clase normal es que si tienen 
	constructor, éste debe ser privado para que no se puedan crear nuevos objetos.

	Ejemplo: Los futbolistas están caracterizados por una demarcación a la hora de jugar un partido de fútbol, por tanto, las demarcaciones
	en las que puede jugar un futbolista son finitas y se pueden enumerar en: Portero, Defensa, Centrocampista y Delantero. Con esta
	especificación podemos crearnos el siguiente enum. Nota: aunque no es una regla, se acostumbra escribir los miembros de un enum
	en mayúsculas.
*/

public enum Demarcacion{
	PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

/*
	Es importante saber que un Enum es realmente una clase, cuyos objetos sólo pueden ser los definidos en esta clase, hereda
	de la clase Enum(java.lang.Enum) una serie de métodos heredados de esa clase padre.
*/