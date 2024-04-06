package com.jjoseorione.vehiculos;

public class Camion extends Vehiculo{
	public Camion(){
		this.makeAndModel += " Camion";
	}
	public String conducir(int distancia){
		return "Conduciendo camion, avanzando " + distancia + " metros.";
	}
	public void start(){
		System.out.println("Encender camion");
	}
}