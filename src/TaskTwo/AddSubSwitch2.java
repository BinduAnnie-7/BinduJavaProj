package TaskTwo;

import java.util.Scanner;

//It's not printing the default option, when answer is in negative .
public class AddSubSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int val, first = 0, second = 0, first1 = 0, second2 = 0, ans = 0;

		System.out.println("Select any value");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Division");
		System.out.println("4) Multiplication");
		System.out.println("5) Average");

		val = sc.nextInt();

		if (val < 1 || val > 5) {
			System.out.println(" Please select Options between 1 and 5");
		} else {
			System.out.println("Enter  any two values");
			first = sc.nextInt();
			second = sc.nextInt();

			if (val == 5) {
				System.out.println("Enter  two more  values");
				first1 = sc.nextInt();
				second2 = sc.nextInt();

			}

		}

		switch (val) {

		case 1:
			ans = first + second;
			if (ans > 0) {
				System.out.println("Addition of two numbers: " + ans);

			}

			break;
		case 2:
			ans = first - second;
			if (ans > 0) {
				System.out.println("Subtraction of two numbers: " + ans);
			}
			break;
		case 3:
			ans = first / second;
			if (ans > 0) {
				System.out.println("Division of two numbers: " + ans);
			}
			break;
		case 4:
			ans = first * second;
			if (ans > 0) {
				System.out.println("Multiplication of two numbers: " + ans);
			}
			break;
		case 5:
			ans = (first + second + first1 + second2) / 4;
			if (ans > 0) {
				System.out.println("Average of two numbers: " + ans);
			}
			break;
		default:

			System.out.println("Oops option: " + val + " is returning the negative number");

		}
	}

}
