package com.jjoseorione.test;
public class TestClass{
	public static void main(String[] args){
		int[] _1D1 = new int[]{ 1 , 2 , 3 };
		int[] _1D2 = new int[]{ 4 , 5 , 6 };
		int[] _1D3 = new int[]{ 7 , 8 , 9 };
		int[] _1D4 = new int[]{ 10 , 11 , 12 };
		int[] _1D5 = new int[]{ 13 , 14 , 15 };
		int[][] _2D1 = new int[][]{ _1D4 , _1D1 };
		int[][] _2D2 = new int[][]{ _1D3 , _1D5, _1D2 };
		int[][][] _3D = new int[][][]{ _2D1 , _2D2 };

		for(int i = 0; i < _3D.length; i++){
			System.out.println("{");
			for(int j = 0; j < _3D[i].length; j++){
				System.out.print("\t|");
				for(int k = 0; k < _3D[i][j].length; k++)
					System.out.print(_3D[i][j][k] + "\t");
				System.out.print("|\n");
			}
			System.out.println("}\n\n");
		}
	}
}