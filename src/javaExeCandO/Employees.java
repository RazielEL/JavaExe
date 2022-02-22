package javaExeCandO;

public class Employees {
	
	Employees(String name, int yoj, int salary, String address){
		System.out.println(name + "   " + yoj + "   " + salary + "   " + address);
	}
	
	
	
	

	public static void main(String[] args) {
		
		Employees temp = new Employees("Name", 1900, 2000, "Address");
		Employees no1 = new Employees("Robert", 1994, 2500, "Glendale");
		Employees no2 = new Employees("Sam", 2000, 1500, "Auschwitz");
		Employees no3 = new Employees("John", 1991, 2400, "Kazimierz");
		
		
		
	}

}
