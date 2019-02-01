package week1_inClass;



public class MyPractice {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Computer Science", "John", "Smith", 123);
		Student student2 = new Student("Health and Wellness", "Joseph", "Richtor", 124);
		Student student3 = new Student("History", "Jo", "Sam", 125);
		Student student4 = new Student("Psychology", "James", "Smitty", 126);
		
		Student[] students = {student1, student2, student3, student4};
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
		
	}
	
	
	

}

class Student {
	
	String major;
	String firstName;
	String lastName;
	int 	studentId;
	
	public Student(String major, String firstName, String lastName, int studentId) {
		this.major = major;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + lastName + " " + " (" + this.major + ")";
	}
}
