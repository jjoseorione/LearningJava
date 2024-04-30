package com.jjoseorione.vehiculos;
import static com.jjoseorione.util.VehicleHelper.register;

public abstract class Vehiculo implements Conducible{
	protected String makeAndModel = "dummy makeAndModel";
	protected String vin = "dummy VIN";

	public Vehiculo(String vin){
		this.vin = vin;
		register(this);
	}

	public String getMakeAndModel(){
		return this.makeAndModel;
	}

	public final String getVIN(){
		return this.vin;
	}

	public abstract String getFeature(String featureName);
}