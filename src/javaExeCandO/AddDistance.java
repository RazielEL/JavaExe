package javaExeCandO;
import java.util.*;

public class AddDistance {
	
	int a1;
	int a2;
	int b1;
	int b2;
	int suma;
	int sumb;
	
	void data() {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("1st distance feet: ");
	a1 = sc.nextInt();	
	System.out.println("1st distance inch: ");
	b1 = sc.nextInt();
	System.out.println("2nd distance feet: ");
	a2 = sc.nextInt();
	System.out.println("2st distance inch: ");
	b2 = sc.nextInt();
	System.out.println("You wanna sum " + a1 + " feet " + b1 + " inches with " + a2 + " feet " + b2 + " inches.");
	}
	
	void operation() {
		if ((b1+b2)>12) {
			
			suma++;
			b2 = 12 - b1;
			suma = a1 + a2;
			sumb = b1 + b2;
			
		}
		else if ((b1+b2)==12) {
			
			suma = a1+a2+1;
			sumb = 0;
			
		}
		else {
			suma = a1+a2;
			sumb = b1+b2;
		}
		
		System.out.println("Sum equalls to: " + suma + " feet and " + sumb + " inches.");
	}
	
	
	
	public static void main(String[] args) {
		
		AddDistance mark1 = new AddDistance();
		
		mark1.data();
		mark1.operation();
		
		
	}

}
