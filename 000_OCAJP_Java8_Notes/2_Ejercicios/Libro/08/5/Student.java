package com.jjoseorione.school;

public class Student{
	public final int studentId;
	public String email;
	public String name;
	public static int lastStudentId = 0;

	static{
		lastStudentId = 0;
	}

	public static void callsMain(){
		main(null);
	}

	public Student(String name, String email){
		this.name = name;
		this.email = email;
	}

	public Student(){
		this.name = "";
		this.email = "";
	}

	public static void method1(Student student){
		student.name = "Valor cambiado";
		student.email = "Valor cambiado";
		//student.studentId = 50;	//No es posible cambiar el id debido a que es final
		student.lastStudentId = 99;
		method2(student);
		System.out.println(student);
	}

	public static void method2(Student student){
		System.out.println(student);
		student = new Student("Creado en ", "method2");
		return;
	}

	@Override
	public String toString(){
		return "name: " + name + "\nemail: " + email + "\nstudentId: " + studentId +
				"\nlastStudentId: " + lastStudentId;
	}

	{
		lastStudentId++;
		studentId = lastStudentId;
	}

	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student("Jose Emmanuel", "jjoseorione@gmail.com");
		s1.name = "Pedro Paramo";
		s2.name = "Esther Nila";
		s1.email = "p_p@gmail.com";
		s2.email = "esthernila@gmail.com";
		method1(s3);
	}

}