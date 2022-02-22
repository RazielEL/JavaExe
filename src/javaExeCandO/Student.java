package javaExeCandO;

public class Student {

	String name;
	int roll_no;
	int phone;
	String address;
	
	
	Student(String name, int roll_no, int phone, String address) {
		
		System.out.println("Mam na imie " + name + " i jestem numer " + roll_no + ". Moj nr telefonu to " + phone + " i mieszkam w " + address);
	}
	
	public static void main(String[] args) {
		

		Student one = new Student("John", 2, 123412, "Amityville");
		Student two = new Student("Sam", 3, 123455, "Lindenhurst");
		

		
		
	}

}
