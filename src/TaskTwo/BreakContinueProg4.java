package TaskTwo;

import java.util.Scanner;

public class BreakContinueProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("Enter any number");

		while (true) {
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("It's Over");
				break;
			}
			System.out.println("Good Going");
		}

	}

}
