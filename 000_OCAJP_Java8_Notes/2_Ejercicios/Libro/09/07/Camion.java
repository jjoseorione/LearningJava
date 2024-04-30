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

	public String getFeature(String featureName){
		switch(featureName){
			case "height":
				return "3.5 mts";
			case "width":
				return "2.0 mts";
			case "length":
				return "8.0 mts";
			case "power":
				return "450 HP";
			case "boot":
				return "8 m3";
			default:
				return "N.A";
		}
	}
}