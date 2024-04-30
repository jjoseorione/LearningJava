package com.jjoseorione.test;
import com.jjoseorione.vehiculos.*;

public class TestClass{
	public static void main(String[] args){
		Vehiculo[] vehiculos = new Vehiculo[2];
		vehiculos[0] = new Coche();
		vehiculos[1] = new Camion();
		for( Vehiculo c : vehiculos ){
			System.out.println(c.conducir(13));
			System.out.println(c.getMakeAndModel());
		}
	}
}