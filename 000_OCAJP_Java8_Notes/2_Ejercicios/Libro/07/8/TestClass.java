package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int[] ar = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
		boolean bandera = false;
		for( int num : ar ){
			if(bandera){
				System.out.print(num + "\t");
				bandera = false;
			}
			else{
				bandera = true;
				continue;
			}
		}
	}
}