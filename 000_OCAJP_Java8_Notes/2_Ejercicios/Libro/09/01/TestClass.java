package com.jjoseorione.test;
import com.jjoseorione.vehiculos.*;

public class TestClass{
	public static void main(String[] args){
		Coche c1 = new Coche();
		Camion c2 = new Camion();
		System.out.println(c1.conducir(13));
		System.out.println(c2.conducir(8));
	}
}