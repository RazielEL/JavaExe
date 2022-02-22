package javaExeCandO;
import java.util.*;
public class conversions {
	
	conversions (String firstName, String lastName, double mass, double height) {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Weight: " + mass);
		System.out.println("Height: " + height);
	}
	
	void kgs(double mass) {
		
		double kg = mass * 0.4536;
		System.out.println("Your weight in kg is " + kg);
		
	}
	
	void ms (double height) {
	
		double ms_cm = height * 2.54;
		double ms = ms_cm / 10;
		System.out.println("Your height in meters is " + ms_cm);
	}
	
	void feet (double height) {
		
		int feet = (int) height/12;
		int inches = (int) height%12;
		System.out.println("Which is : " + feet + " feet and " + inches + " inches");
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Weight (lbs): ");
		int mass = sc.nextInt();
		System.out.println("Height (inches): ");
		int height = sc.nextInt();
		
		conversions person1 = new conversions(firstName, lastName, mass, height);
		person1.kgs(mass);
		person1.ms(height);
		person1.feet(height);
		
		
	}
	


}
