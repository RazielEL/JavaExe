package replit;

public class rep072 {

	public static void main(String[] args) {
	    char[] a = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

	    for (int i=0; i<a.length; i++){

	        if (i == 1) {
	          continue;
	        }
	        if (a[i] == 's' || a[i] == 'y' || a[i] == 'n' || a[i] == 't' || a[i] == 'a' || a[i] == 'x') { 
	        
	            
	            System.out.print(a[i]);
	          
	        }
	        
	        }
	        

	}

}
