package TaskThree;

import java.util.Scanner;

public class MonthProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		int months, flag = 1;

		System.out.println("Enter  1 to 12 months");
		months = sc.nextInt();

		if (months > 12) {
			System.out.println("Invalid Details");
		} else {
			for (i = 1; i <= months; i++) {

				if (i == 4 || i == 6 || i == 9 || i == 11) {
					System.out.println(i + " month " + 30 + " days");
				} else if (i == 2) {
					System.out.println(i + " month " + 29 + " days");
				} else {
					System.out.println(i + " month " + 31 + " days");
				}

			}

		}

	}

}
