package com.jjoseorione.admin;

import com.jjoseorione.school.Student;

public class Course{
	public static void main(String[] args){
		Student.callsMain();	//Crea 4 objetos y los imprime en pantalla

		Student s1 = new Student("Juan Pedro", "jp@gmail.com");
		System.out.println(s1);
		enroll(s1);
		System.out.println(s1);
	}

	public static void enroll(Student s1){
		s1.name = "Cambiado en enroll";
		s1.email = "Cambiado @ enroll";
		// s1.varDefault = "Default cambiado en enroll";
		// s1.varProtected = "Protected cambiado en enroll";
		// s3.varPrivate = "Private cambiado en enroll";
		System.out.println(s1.name);
		System.out.println(s1.email);
		// System.out.println(s1.varDefault);
		// System.out.println(s1.varProtected);
		// System.out.println(s1.varPrivate);
	}
}