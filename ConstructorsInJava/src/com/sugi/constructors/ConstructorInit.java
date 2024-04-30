package com.sugi.constructors;

public class ConstructorInit {

	int age;

	String name;

	int no;

	public ConstructorInit() {
		System.out.println("I am zero arg const");
	}

	// constructor overloading
	public ConstructorInit(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public ConstructorInit(int age, int no) {
		this.age = age;
		this.no = no;
	}

	public ConstructorInit(ConstructorInit ob) {
		this.age = ob.age;
		this.no = ob.no;
	}

	public static void main(String[] args) {

		ConstructorInit object = new ConstructorInit();
		System.out.println(object);

		ConstructorInit obj1 = new ConstructorInit(10, "Test");
		System.out.println(obj1.age);
		System.out.println(obj1.name);

		ConstructorInit obj2 = new ConstructorInit(10, 10);
		System.out.println(obj2.age);
		System.out.println(obj2.no);
		
		ConstructorInit ob3 = new ConstructorInit(obj2);
		System.out.println(ob3.age);
		System.out.println(ob3.no);
		
	}

}
