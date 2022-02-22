package javaExeCandO;
import java.util.*;
public class Employee {
	
	Scanner sc = new Scanner(System.in);
	
	int salary;
	int hours;
	int a = 10;
	int b = 5;
	
	void getInfo() {
		System.out.println("What is your salary?");
		this.salary = sc.nextInt();
		System.out.println("How many hours do you work daily?");
		this.hours = sc.nextInt();
	}
	
	void AddSal() {
		if (this.salary < 500) {
			this.salary = this.salary + 10;
		}
	}
	
	void AddWork() {
		if (this.hours > 6) {
			this.salary = this.salary + 5;
			System.out.println("Your final salary is: " + salary);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int salary;
		Employee no1 = new Employee();
		
		no1.getInfo();
		no1.AddSal();
		no1.AddWork();
		

	}

}
