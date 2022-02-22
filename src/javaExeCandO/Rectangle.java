package javaExeCandO;
import java.util.*;
public class Rectangle {
		
	int a;
	int b;
	int area;
	
	void setDim() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st dimention: ");
		a = sc.nextInt();
		System.out.println("2nd dimention: ");
		b = sc.nextInt();
	}
	void getArea() {
		this.a = a;
		this.b = b;
		this.area = a*b;
		System.out.println("Area of the rectangle is " + area);
	}
		
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setDim();
		rec.getArea();

	}

}
