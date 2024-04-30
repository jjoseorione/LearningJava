package test;

public class TestClass{
	public static void main(String[] args){
		String[][] aaS = { 
			{ "longitud", " dos" } , 
			{ "array " , " de" , " longitud", " 4" } , 
			{ "este ", "array " , "tiene ", "longitud ", "cinco " } ,
			{ "uno" } 
		};

		System.out.println("Array principal: " + aaS.length);
		for (String[] aS : aaS){
			System.out.println("Array interno: " + aS.length);
		}
	}
}