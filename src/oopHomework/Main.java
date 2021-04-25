package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course();
		course1.categoryId=1;
		course1.id=1;
		course1.instructorId=1;
		course1.name="Yazilim Gelistirici Yetistirme Kampi(C#+Angular)";
		course1.status=true;
		
		
		
		Course[] courses= {course1};
		
		for (Course course : courses) {
			System.out.println("Kurs ismi: " + course.name+" Egitmen id: "+course.instructorId);
		}
		
		Course course2 = new Course(2,"Yazilim Gelistirici Yetistirme Kampi(Java+React)",1,1,true);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course2);
		courseManager.deleteFromCourse(course1);
		
		
		
		Category category1 = new Category(1,"Programlama",true);
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Veri Bilimi";
		category2.status=true;
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println("Kategori ismi: "+category.name);
		}
		
		User user1=new User();
		user1.firstName="Skyman";
		user1.lastName="Sky";
		user1.email="skyman@sky.com";
		
		User user2 = new User(2,"Skysoldier","soldier","skysoldier@sky.com",true);
		
		User[] users = {user1,user2};
		
		for (User user : users) {
			System.out.println(user.firstName+" "+user.lastName+" "+user.email);
		}
	}

}
