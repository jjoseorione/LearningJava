package com.jjoseorione.vehiculos;

public abstract class Vehiculo implements Conducible{
	protected String makeAndModel = "dummy makeAndModel";
	protected String vin = "dummy VIN";

	public String getMakeAndModel(){
		return this.makeAndModel;
	}

	public final String getVIN(){
		return this.vin;
	}
}