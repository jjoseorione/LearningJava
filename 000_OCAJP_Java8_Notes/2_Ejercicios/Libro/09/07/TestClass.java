package com.jjoseorione.test;
import com.jjoseorione.vehiculos.*;

public class TestClass{
	public static void main(String[] args){
		Vehiculo[] vehiculos = new Vehiculo[3];
		vehiculos[0] = new Coche("KRS-300");
		vehiculos[1] = new Camion("TRS-99");
		vehiculos[2] = new ToyCar();
		for( Vehiculo c : vehiculos ){
			System.out.println("________________________________________");
			System.out.println(c.conducir(13));
			System.out.println(c.getMakeAndModel());
			System.out.println(c.getVIN());
			System.out.println("height: " + c.getFeature("height"));
			System.out.println("width: " + c.getFeature("width"));
			System.out.println("length: " + c.getFeature("length"));
			System.out.println("boot: " + c.getFeature("boot"));
			System.out.println("power: " + c.getFeature("power"));
			System.out.println("convertible: " + c.getFeature("convertible"));

		}
	}
}