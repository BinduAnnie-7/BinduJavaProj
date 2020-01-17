package TaskTwo;

import java.util.Scanner;

public class NumIfDivisible1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number divisble by 5 or 3");
		num = sc.nextInt();

		if ((num % 3) == 0 && (num % 5 == 0)) {
			System.out.println("Consultadd JAVA Training");
		} else {
			if (num % 3 == 0) {
				System.out.println("Consultadd");
			} else if (num % 5 == 0) {
				System.out.println("JAVA Training");
			}
		}
	}

}
