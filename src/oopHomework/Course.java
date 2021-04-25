package oopHomework;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id, String name, int instructorId, int categoryId,boolean status) {
		this.id=id;
		this.name=name;
		this.instructorId=instructorId;
		this.categoryId=categoryId;
		this.status=status;
				
	}
	
	int id;
	String name;
	int instructorId;
	int categoryId;
	boolean status;

}
