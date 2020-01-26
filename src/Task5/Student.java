package Task5;

/*
 PROGRAM 4:- Write a program to print the names of students by creating a Student class. If no name is passed while creating an object
  of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while 
  creating object of Student class. (Hint: Overloading concept)
 */
public class Student {

	String name;

	public Student() {
		// TODO Auto-generated constructor stub
		name = "Unknown";
	}

	Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("Diana");
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}
