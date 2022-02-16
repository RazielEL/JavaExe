package javaExeArrays;
import java.util.Scanner;
public class AE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If array has any specific value
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert specific value if there is any inside the ARRAY: ");
		int b = sc.nextInt();
		
		
		int[][] a =  {{23, 55, 31, 67, 42, -5, 1, 5, 7, 200},{66, 43, 6, 43, 32, 78, -4, 3, 1, 100}};
		int i = 0;
		int j = 0;
		int k = 0;
		boolean ti = false;
		
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				if (a[i][j] == b) {
					k++;
					ti = true;
					
				}
				
			}
		}
		
		if (ti) {
			System.out.println("This number was there " + k + " times." );
		}
		
		else {
			System.out.println("This number was not there");
		}
	}

}
