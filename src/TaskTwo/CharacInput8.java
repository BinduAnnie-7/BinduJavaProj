package TaskTwo;

import java.util.Scanner;

public class CharacInput8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		String str = String.valueOf(ch);
		if (str.equalsIgnoreCase("r") || str.equalsIgnoreCase("a") || str.equalsIgnoreCase("n")
				|| str.equalsIgnoreCase("d") || str.equalsIgnoreCase("o") || str.equalsIgnoreCase("r")) {
			System.out.println("FOUND");
		} else {
			System.out.println("NOT FOUND");
		}

	}

}
