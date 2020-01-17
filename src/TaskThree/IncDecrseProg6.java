package TaskThree;

import java.util.Scanner;

public class IncDecrseProg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long no1, no2, no3;
		System.out.println("Enter three numbers");
		no1 = sc.nextLong();
		no2 = sc.nextLong();
		no3 = sc.nextLong();

		if (no2 > no1 && no3 > no2) {
			System.out.println("INCREASING");
		} else if (no2 < no1 && no3 < no2) {
			System.out.println("DECREASING");
		} else {
			System.out.println("Neither increasing or decreasing");
		}
	}

}
