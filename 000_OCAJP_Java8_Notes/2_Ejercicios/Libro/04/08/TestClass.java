package com.jjoseorione.test;

public class TestClass{
	public static void main(String args[]){
		int matrix[][] = {
			{ 1 , 4 , 12 , 6 , 21 , 18 } ,
			{ 0 , 8 , 42 , 14 , 23 , 9 } ,
			{ 0 , 0 , 12 , 34 , 63 , 4 } ,
			{ 0 , 0 , 0 , 15 , 23 , 15 } ,
			{ 0 , 0 , 0 , 0 , 18 , 45 } ,
			{ 0 , 0 , 0 , 0 , 0 , 23 } ,
		};

		for(int[] ai : matrix){
			for(int element : ai)
				System.out.print(element + "\t");
			System.out.println();
		}

	}
}