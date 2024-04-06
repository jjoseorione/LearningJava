package com.jjoseorione.vehiculos;

public abstract class Vehiculo implements Conducible{
	protected String makeAndModel = "dummy makeAndModel";

	public String getMakeAndModel(){
		return this.makeAndModel;
	}
}