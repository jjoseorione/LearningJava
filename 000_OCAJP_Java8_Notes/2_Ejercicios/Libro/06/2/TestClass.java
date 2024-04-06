package com.jjoseorione.test;

public class TestClass{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]), sum = 0;
		switch(num){
			case 5:	sum+=5;
			case 4: sum+=4;
			case 3: sum+=3;	
			case 2: sum+=2;
			case 1: sum+=1;	
			default: break;
		}

		System.out.println(sum);
	}
}