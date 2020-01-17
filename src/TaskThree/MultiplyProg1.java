package TaskThree;

import java.util.Scanner;

public class MultiplyProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0, i, ans;
		System.out.println("Enter any number");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			ans = num * i;
			System.out.println(num + " * " + i + "= " + ans);
		}
	}

}
