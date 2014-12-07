//Matthew Schlogel
//FINAL


import java.util.UUID;

public class Person {
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
//Getter Methods______________________________________________
	public String getFirstName(){
		return this.FirstName;
	}
	
	public String getLastName(){
		return this.LastName;
	}
	
	public UUID getPersonID(){
		return this.PersonID;
	}
	
//Setter Methods______________________________________________
	public void setFirstName(String firstName){
			this.FirstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.LastName = lastName;
	}
	
	public void setPersonID(){
		UUID newID = UUID.randomUUID();
		this.PersonID = newID;
	}
}
