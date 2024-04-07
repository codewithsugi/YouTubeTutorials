package com.sugi.arraysexample;

public class StudentArrayExample {

	public static void main(String[] args) {
	
		
		Student[] students = new Student[3];
		System.out.println("Length od student array :: "+students.length);
		
		students[0] = new Student(1000,"Alwin");
		
		students[1] = new Student(2000, "Amir");
		
		students[2] = new Student(3000,"Alex");
		
		for( Student student  :   students)
		{
			student.display();
		}
		
		
		// Object 
		
		// limitations:
			// 1. fixed in size 
			// 2. same data type -- Object[]
		
		 Object[] objectArray = new Object[5];  // one dimensional 
		 
		 objectArray[0] = 10;
		 
		 objectArray[1] ="abcd";
		 
		 objectArray[2] =10.4343f;
		 
		 objectArray[3] = 1099.54;
		 
		 objectArray[4] = 191913133131211l;

		 for(Object obj : objectArray)
		 {
			 System.out.println(obj);
		 }

		 // int 
		 int a[] = new int[3];
		 
		
		
	   
	}

}
