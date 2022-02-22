package ClassYT;

// class should be defined as a single entity - person, name, age or sth like that.

public class Pokemon { // < -- classname
	
//		// instance variables
	
//		int var1;
//		String var2;
//		
//		// methods
//		
//		void method1 (/* parameters */) {
//			// body of method
//		}
//		
//		int method2 (/* parameters */) {
//			// body of method
//			return 0;
//		}
	
	String name;
	int level;
	
	void attack() {
		System.out.println(name + " attack!");
	}
	
	// this is a BLUEPRINT for creating objects. Go to MAIN.java.
	
	
	
	Pokemon(){  //ustawiamy default settings dla class POKEMON. po to sa te constructor. Wroc do main.
		level = 1;
	}
	Pokemon(String pName, int pLevel){
			name = pName;
			level = pLevel;
	}
	
	Pokemon(String name, int level) {
		
			this.name = name;
			this.level = level;
			
	}
		
	// to co wyzej to ma blad, ale chodzi o to, ze jak uzyjemy this. keyword to nam odniesie sie do tych zmiennych ktore sa zdefiniowane na dla tej classy, czyli 
	// te pierwsze na samej gorze.
	
	
	
}
