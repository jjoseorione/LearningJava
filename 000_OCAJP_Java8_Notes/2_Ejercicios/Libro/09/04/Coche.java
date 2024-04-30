package com.jjoseorione.vehiculos;

public class Coche extends Vehiculo{
	public Coche(){
		this.makeAndModel += " Coche";
	}
	public String conducir(int distancia){
		return "Conduciendo coche, avanzando " + distancia + " metros.";
	}
	// public void start(){
	// 	System.out.println("Encender coche");
	// }
}