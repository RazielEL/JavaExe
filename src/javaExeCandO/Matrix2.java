package javaExeCandO;
import java.util.*;
public class Matrix2 {
	
	int a;
	int b;	
	int[][] cat = new int[a][b];	
	
	void NumOfRows() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of verses: ");
		int a  = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int b = sc.nextInt();	
		
		this.a = a;
		this.b = b;
		
	}
	
	void CreateAnArray() {
		
		int[][] cat = new int[a][b];
		System.out.println("Rows: " + a);
		System.out.println("Collumns: " + b);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println("Give me number for an array");
				cat[i][j] = sc.nextInt();
				
			}
			System.out.println();
			}
		
		System.out.println(Arrays.deepToString(cat));
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		Matrix2 mark1 = new Matrix2();
		
		mark1.NumOfRows();
		mark1.CreateAnArray();
		
		
		
	}

}
