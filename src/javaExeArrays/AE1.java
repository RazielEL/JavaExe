package javaExeArrays;

public class AE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a =  {{23, 55, 31, 67, 42, -5, 1, 5, 7, 200},{66, 43, 6, 43, 32, 78, -4, 3, 1, 100}};
		int i = 0;
		int j = 0;
		double avg1 = 0;
		double avg2 = 0;
		double sum1 = 0;
		double sum2 = 0;
		int sum = 0;
		double avg = 0;
		double asum = 0;
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				asum++;
			}
		}
		
		System.out.println(asum);
		
		for (i = 0; i < a.length; i++) {
			for (j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for (i=0; i < a[0].length; i++) {
			
			sum1 = sum1 + a[0][i]; 
			avg1 = sum1 / a[0].length;
		}
			System.out.println("AVG for Arr[0][j]: " + avg1);
			
		for (i = 0; i < a[1].length; i++) {
			sum2 = sum2 + a[1][i];
			avg2 = sum2 / a[1].length;
		}
			System.out.println("AVG for Arr[1][j]: " + avg2);
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				avg = sum / asum ;
			}
		}
			System.out.println("AVG for Arr[i][j]: " + avg);
			
		
		
		
		
	}

}
