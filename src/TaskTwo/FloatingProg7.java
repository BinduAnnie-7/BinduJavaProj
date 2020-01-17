package TaskTwo;

import java.util.Scanner;

public class FloatingProg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any floating point number");

		float num = sc.nextFloat();
		if (num == 0) {
			System.out.println("zero");
		} else {
			if (num > 0) {
				System.out.println("positive");
			} else {
				System.out.println("negative");
			}

		}
		if (Math.abs(num) < 1 || Math.abs(num) > 1000000) {
			System.out.println("small");
		}
	}

}
