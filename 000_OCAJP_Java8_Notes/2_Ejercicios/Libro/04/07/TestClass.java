package com.jjoseorione.test;

import com.jjoseorione.utils.Data;

public class TestClass{
	public static void main(String[] args){
		Data d = new Data();

		Data ad[] = new Data[3];
		ad[0] = d;
		ad[1] = d;
		ad[2] = d;

		ad[1].value = 51677147;

		System.out.println(ad[0].value);
		System.out.println(ad[1].value);
		System.out.println(ad[2].value);
		System.out.println(d.value);
	}
}