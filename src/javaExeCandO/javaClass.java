package javaExeCandO;

public class javaClass {  // this is a class. 
	public static void main(String[] args) {
		
		Student myStudent = new Student();	 // this is an object, it is an instance of a class
			myStudent.firstName = "Jim";
			myStudent.lastName = "Halpert";
			myStudent.major = "Business";
			myStudent.gpa = 2.3;
			myStudent.age = 24;
			myStudent.onProbation = false;
			
			System.out.println(myStudent.firstName);
			
			
			
			
	}

}
