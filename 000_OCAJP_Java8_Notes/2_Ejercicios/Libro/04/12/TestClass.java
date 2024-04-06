package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int[][][] nums = new int[1][4][2];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				for(int k = 0; k < nums[i][j].length; k++){
					nums[i][j][k] = i + j + k;
					System.out.println("nums[" + i + "][" + j + "][" + k + "] = " + nums[i][j][k]);
				}
			}
		}
	}
}