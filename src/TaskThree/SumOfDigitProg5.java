package TaskThree;

import java.util.Scanner;

public class SumOfDigitProg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long no, r, sum = 0, cnt = 0;
		System.out.println("Enter any long type number eg:2345");
		no = sc.nextLong();

		while (no != 0) {
			r = no % 10;
			no = no / 10;
			sum = sum + r;
			cnt++;
		}
		System.out.println("Number of digits: " + cnt);
		System.out.println("Sum of digits: " + sum);
	}

}
