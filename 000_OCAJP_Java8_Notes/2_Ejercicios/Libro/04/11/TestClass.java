package com.jjoseorione.test;

public class TestClass{
	public static void main(String args[]){
		int[][] nums = new int[1][3];

		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;

		for(int[] ai : nums)
			for(int i : ai)
				System.out.println(i);
		
	}
}