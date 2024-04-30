package com.jjoseorione.vehiculos;

interface Conducible{
	String conducir(int x);
	default void start(){
		System.out.println("Default method");
	}
}