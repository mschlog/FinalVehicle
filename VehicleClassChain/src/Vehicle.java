//Matthew Schlogel
//FINAL

public abstract class Vehicle implements Interface{
	
	private String Name;
	private String Color;
	private double Weight;
	private Person Owner;
	
	protected void transferOwnership(Person owner){
		this.Owner = owner;
	}

	public Person getOwner(){
		return this.Owner;
	}
	
}	
	

