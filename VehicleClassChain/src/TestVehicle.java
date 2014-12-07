//Matthew Schlogel
//FINAL

public class TestVehicle {

	public static void main(String[] args){
		
//Creating person a		
	Person a = new Person();
	a.setFirstName("FirstNameA");
	a.setLastName("LastNameA");
	a.setPersonID();

//Creating Car Herbie
	Car Herbie = new Car();
	Herbie.transferOwnership(a);
	Herbie.setNumberOfDoors(4);
	
//Creating Truck GraveDigger	
	Truck GraveDigger = new Truck();
	GraveDigger.transferOwnership(a);
	GraveDigger.setNumberOfAxels(2);
	
//Creating person b
	Person b = new Person();
	b.setFirstName("FirstNameB");
	b.setLastName("LastNameB");
	b.setPersonID();
		
//Transferring Ownership
	GraveDigger.transferOwnership(b);
	
//Creating Motorcycle w/ no sidecar
	Motorcycle GSXR1000 = new Motorcycle();
	GSXR1000.setHasSideCar(false);
	
	}
}
