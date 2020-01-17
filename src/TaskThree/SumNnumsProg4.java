package TaskThree;

import java.util.Scanner;

public class SumNnumsProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 0;
		System.out.println("Enter any number");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of n natural numbers: " + sum);
	}

}
