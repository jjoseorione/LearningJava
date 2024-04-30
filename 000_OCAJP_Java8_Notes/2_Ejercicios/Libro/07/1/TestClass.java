package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		try{
			Integer.parseInt(args[1]);
			Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Tienes que invocar este programa con dos parametros");
			System.exit(1);
		}
		catch(NumberFormatException e){
			System.out.println("Los parametros deben ser dos numeros enteros. El primero es" + 
			" la dimension de la matriz, el segundo es la opcion de ciclo (1 para for, 2 " + 
			"para while). ");
			System.exit(1);
		}

		int p = Integer.parseInt(args[1]);
		final int DIMENSION = Integer.parseInt(args[0]);

		int[][] matrix = new int[DIMENSION][];
		
		if(p == 1){
			for(int i = 0; i < matrix.length; i++){
				matrix[i] = new int[DIMENSION-i];
				for(int j = 0; j < matrix[i].length; j++){
					matrix[i][j] = i + j;
				}
			}
		}
		else if(p == 2){
			int i = 0; 
			while(i < matrix.length){
				matrix[i] = new int[DIMENSION-i];
				int j = 0;
				while( j < matrix[i].length ){
					matrix[i][j] = i + j;
					j++;
				}
				i++;
			}
		}
		else
			System.out.println("El segundo parametro solo puede ser 1 o 2");

		if(p == 1 || p == 2)
			for(int[] fila : matrix){
				for(int elem : fila)
					System.out.print(elem + "\t");
				System.out.println("\n");
			}
	}
}