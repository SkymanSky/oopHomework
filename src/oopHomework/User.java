package oopHomework;

public class User {
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, boolean status) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email= email;
		this.status=status;
				
	}
	
	int id;
	String firstName;
	String lastName;
	String email;
	boolean status;

}
