package TaskTwo;

import java.util.Scanner;

public class BreakContinueProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0, i = 0;

		System.out.println("Enter any number");
		num = sc.nextInt();

		for (i = num; i <= num + 1; i++) {
			if (num > 0) {
				System.out.println("Good Going");
				continue;
			} else if (num < 0) {
				System.out.println("It's Over");
				break;

			}

		}

	}

}
