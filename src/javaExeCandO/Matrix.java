package javaExeCandO;
import java.util.*;
public class Matrix {
	
	
	Matrix()
	
	{
		int a = 0;
		int b = 0;	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number of verses: ");
		a = sc.nextInt();
		System.out.println("Enter number of columns: ");
		b = sc.nextInt();
		
		int[][] c = new int[a][b];	
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println("Give me number for an array");
				c[i][j] = sc.nextInt();
			}
			}
			
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
	
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		
	
		Matrix mark1 = new Matrix();

	}

}
