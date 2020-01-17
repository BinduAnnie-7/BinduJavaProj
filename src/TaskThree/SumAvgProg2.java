package TaskThree;

import java.util.Scanner;

public class SumAvgProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num, i, sum = 0;
		float avg = 1;
		System.out.println("Enter any  ten numbers");
		for (i = 1; i <= 10; i++) {
			num = sc.nextInt();
			sum = sum + num;
			avg = (float) sum / 10;
		}

		System.out.println("Sum of ten numbers: " + sum);
		System.out.println("Average of ten numbers: " + avg);
	}

}
