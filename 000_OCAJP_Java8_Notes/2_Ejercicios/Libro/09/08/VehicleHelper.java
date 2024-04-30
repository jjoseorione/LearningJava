package com.jjoseorione.util;
import com.jjoseorione.vehiculos.Vehiculo;

public interface VehicleHelper{
	public static void register(Vehiculo v){
		System.out.println("VIN: " + v.getVIN());
	}
}