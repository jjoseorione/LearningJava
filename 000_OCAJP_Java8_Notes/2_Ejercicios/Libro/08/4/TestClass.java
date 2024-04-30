package com.jjoseorione.test;

//import static com.jjoseorione.school.Student.*;
import static com.jjoseorione.school.Student.lastStudentId;
import static com.jjoseorione.school.Student.callsMain;

public class TestClass{
	public static void main(String[] args){
		callsMain();
		System.out.println(lastStudentId);
	}
}