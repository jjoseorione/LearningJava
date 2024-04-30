package com.jjoseorione.vehiculos;

public class ToyCar extends Coche{
	public ToyCar(){
		//super(null);
		super("N.A.");
	}
	public String getFeature(String featureName){
		switch(featureName){
			case "height":
				return "0.5 mts";
			case "width":
				return "1.0 mts";
			case "length":
				return "1.5 mts";
			case "power":
				return "20 HP";
			default:
				return "N.A";
		}
	}
}