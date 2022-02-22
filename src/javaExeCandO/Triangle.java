package javaExeCandO;

public class Triangle {

	double a;
	double b;
	double c;
	double h;
	double area;
	
	void area() {
		
		a = 4;
		b = 3;
		c = 5;
		h = 3;
		area = 0.5 * a * h;
		System.out.println("area of 345 triangle is " + area);
		
	}
		
	public static void main(String[] args) {
		
		Triangle triforfiv = new Triangle();
		
		triforfiv.area();

	}

}
