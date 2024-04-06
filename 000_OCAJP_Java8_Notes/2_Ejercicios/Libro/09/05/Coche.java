package com.jjoseorione.vehiculos;

public class Coche extends Vehiculo{
	public Coche(String vin){
		this.makeAndModel += " Coche";
		this.vin = vin;
	}
	public String conducir(int distancia){
		return "Conduciendo coche, avanzando " + distancia + " metros.";
	}
	public void start(){
		System.out.println("Encender coche");
	}
}