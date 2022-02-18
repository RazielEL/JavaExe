package replit;

public class rep068 {

	public static void main(String[] args) {
		int i=0;
		int j=0;

		for (i=1; i<=4; i++){
		  for(j=1; j<=4; j++){
		    if (i>=2 && j>=2 && i<=3 && j<=3){
		    	System.out.print(" ");
		      continue;
		    }
		    System.out.print("$");
		    
		  }
		  System.out.println();
		}
	

	}

}
