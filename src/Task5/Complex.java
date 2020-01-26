package Task5;

import java.util.Scanner;

/*PROGRAM1:- Print the sum, difference and product of two complex numbers by creating a class 
named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by user.
*/

public class Complex {

	int sum(int x, int y) {
		return x + y;
	}

	int sub(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values");

		x = sc.nextInt();
		y = sc.nextInt();
		Complex c = new Complex();
		System.out.println("sum is::: " + c.sum(x, y));
		System.out.println("difference is::: " + c.sub(x, y));
	}

}
