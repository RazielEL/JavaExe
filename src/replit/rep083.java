package replit;

public class rep083 {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
	int i =0;
	int j = 0;
    int[] b = new int [4];
	  
//    b[0] = a[0][0] + a[0][1] + a[0][2];
//    System.out.println(b[0]);
//    b[1] = a[1][0] + a[1][1] + a[1][2];
//    System.out.println(b[1]);
//    b[2] = a[2][0] + a[2][1] + a[2][2];
//    System.out.println(b[2]);
//    b[3] = a[3][0] + a[3][1] + a[3][2];
//    System.out.println(b[3]);
// 

	for (i = 0; i < a.length; i++) {
		for (j = 0; j < a[i].length; j++) {
			b[i] = a[i][j] + b[i];
			
			
		}
	}
	for (i = 0; i < a.length; i++) {
		for (j = 3; j == 3; j++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}
		
		
		
	 }
	}