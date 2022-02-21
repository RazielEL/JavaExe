package Calculator;
import java.util.*;

public class Calculator {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void sub(int a, int b) {
		System.out.println(a-b);
	}
			
	void mul (int a, int b) {
		System.out.println(a*b);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert number: ");
		int a = sc.nextInt();
		System.out.println("Insert number: ");
		int b = sc.nextInt();
		
		Calculator plus = new Calculator();
		Calculator minus = new Calculator();
		Calculator times = new Calculator();
		plus.add(a, b);
		minus.sub(a, b);
		times.mul(a, b);
		
		
		
		
		
		
		
		
		
		
	}
	}




