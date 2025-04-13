package example1;

public class airlineApp {

	public static void main(String[] args)
	{
		//Aggregate Object
		pilot p = new pilot ("Rehan");
		p.fly();
		
		//Enclosing Object
		airline ar = new airline("Indigo", p);
		ar.activity();
		
		//Destroying Enclosing Object
		ar = null;
		
		// ar.activity(); - cannot access
						// pilot using airline 
		p.fly();	// can access pilot
					// using p reference variable
	}
}
 