package anudip;
//Superclass
class Hillstations { 
	
	void location() {
		System.out.println("Hill station location");
	}
	void famousFor() {
		System.out.println("Hill staion is faomous for its beauty");
	}
}

//sub class Manali
class Manali extends Hillstations {
	@Override
	void location() {
		System.out.println("Manali is located in himachal pradesh");
	}
	@Override
	void famousFor() {
		System.out.println("Manali is famous for snow and adventure sports");
	}
}
//subclass Mussoorie
class Mussoorie extends Hillstations{
	@Override
	void location() {
		System.out.println("Mussoorie is Located in the Uttarakhand");
	}
	@Override
	void famousFor() {
		System.out.println("Mussoorie isfamous for scenic views");
		
	}
	
}

//subclass Gulmarg
class Gulmarg extends Hillstations{
	@Override
	void location() {
		System.out.println("Gulmarg is Located in the Jammu and Kashmir");
	}
	@Override
	void famousFor() {
		System.out.println("Gulmarg isfamous for skiing");
		
	}
	
}

//main class
public class HillStation {

	public static void main(String[] args) {
		
		// Parent class reference referring to child objects
		Hillstations hs;
		
		hs = new Manali();
		hs.location();
		hs.famousFor();
		
		hs = new Mussoorie();
		hs.location();
		hs.famousFor();
		
		hs = new Gulmarg();
		hs.location();
		hs.famousFor();
		
		System.out.println("\nCalling methods using subclass objects:\n");
		
		//calling using subclass objects
		Manali m = new Manali();
		m.location();
		m.famousFor();
		
		Mussoorie mu = new Mussoorie();
		mu.location();
		mu.famousFor();
		
		Gulmarg g = new Gulmarg();
		g.location();
		g.famousFor();
			
	}

}
