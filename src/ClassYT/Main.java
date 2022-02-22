package ClassYT;

public class Main {

	public static void main(String[] args) {
		
		//this is how we create and ini objects. 
		
		// classname something = new classname(); <--- classname, name of the object = creating object.
		
		Pokemon p1 = new Pokemon();  //if we want to acces anything inside Pokemon class we use p1.
		p1.name = "Pikachu";
		p1.level = 10;
		System.out.println(p1.name + " " + p1.level);
		
		Pokemon p2 = new Pokemon();
		p2.name = "Eevee";
		p2.level = 20;
		p2.attack();
		
		// this object has their own set of variables. CHANGING VARIABLES IN 1 DOESNT CHANGE VARIABLES IN 2.
		// CONSTRUCTORS - special methods that get invoked as soon as the object is created.
		// it is always gonna be: IT'S OWN METHOD, IT'S NOT GONNA HAVE ANY RETURN TYPE AND IT'S ALWAYS GONNA BE THE SAME NAME AS THE CLASS. 
		
		Pokemon p3 = new Pokemon("Bulbasaur", 11);
		p3.attack();  // ustawiamy w class pokemon 
		

	}

}
