package Task5;

/*
 PROGRAM 4:- Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the
  area which is 'length*breadth'. The class has three constructors which are :
  
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */
public class Rectangle {

	int length, breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
		length = breadth = 0;
	}

	public Rectangle(int length, int breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle(int value) {
		length = breadth = value;
	}

	public int area() {
		return length * breadth;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10);
		Rectangle r3 = new Rectangle(30, 20);
		System.out.println("Areas:");

		System.out.println("Area of three Rectangle::: " + r1.area() + "||" + r2.area() + "||" + r3.area());
	}

}
