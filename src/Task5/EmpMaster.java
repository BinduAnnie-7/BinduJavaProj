package Task5;

import java.util.Scanner;

/*PROGRAM 2:- Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address */

class Employee {
	int joinyear, salary;
	String address, name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int joinyear, int salary, String address) {
		this.name = name;
		this.joinyear = joinyear;
		this.salary = salary;
		this.address = address;
	}

	void getEmpData(String name, int joinyear, String address) {
		System.out.println(name + " |" + joinyear + " |" + address);
	}
}

public class EmpMaster extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Robert", 1994, 150000, "64C- Walls Streat");
		Employee e2 = new Employee("Sam", 2000, 130000, "68D- Walls Streat");
		Employee e3 = new Employee("Sam", 2000, 190000, "26B- Walls Streat");

		System.out.println("NAME  YEAR OF JOINING  ADDRESS");

		e1.getEmpData(e1.name, e1.joinyear, e1.address);
		e2.getEmpData(e2.name, e2.joinyear, e3.address);
		e3.getEmpData(e3.name, e3.joinyear, e3.address);

	}

}
