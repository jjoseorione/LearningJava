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
	public String getFeature(String featureName){
		switch(featureName){
			case "height":
				return "1.5 mts";
			case "width":
				return "2.0 mts";
			case "length":
				return "3.0 mts";
			case "power":
				return "200 HP";
			case "convertible":
				return "true";
			default:
				return "N.A";
		}
	}
}