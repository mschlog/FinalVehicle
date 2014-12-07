//Matthew Schlogel
//FINAL

//Project VehicleClass Chain in TestVehicleClass Build Path

import static org.junit.Assert.*;

import org.junit.Test;

//TESTS

public class VehicleJUnit {
	
	@Test
	public void test() {
		
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
		
	//TestCases for Car (Herbie)
		assertEquals("Car Belongs to Person A",a,Herbie.getOwner());
		assertEquals("Car Has Four Doors",4,Herbie.getNumberOfDoors());
	
	//TestCases for Truck (GraveDigger)
		assertEquals("Truck Belongs to Person B",b,GraveDigger.getOwner());
		assertEquals("Truck Has Two Axels",2,GraveDigger.getNumberOfAxels());
		
	//TestCases for Motorcycle GSXR1000
		assertEquals("Motorcycle has no SideCar",false,GSXR1000.getHasSideCar());
		
	}
	//All TESTS PASSED
}
