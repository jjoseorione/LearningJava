package com.jjoseorione.vehiculos;

public class Camion extends Vehiculo{
	public Camion(String vin){
		this.makeAndModel += " Camion";
		this.vin = vin;
	}
	public String conducir(int distancia){
		return "Conduciendo camion, avanzando " + distancia + " metros.";
	}
	public void start(){
		System.out.println("Encender camion");
	}
}