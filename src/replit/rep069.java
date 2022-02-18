package replit;

public class rep069 {

	public static void main(String[] args) {
		int i=0;
		int j=0;

		for (i=7; i>=2; i--) {
			for(j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		for (i=1; i<=7; i++){
			  for(j=1; j<=i; j++){  
				  System.out.print(j + " ");  
			  }
			  System.out.println();
			  }
	}

}
