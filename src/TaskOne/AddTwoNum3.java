package TaskOne;

import java.util.Scanner;

public class AddTwoNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int x,y,z=0;;
		
		System.out.println("Enter any two  numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		z=x+y;
		System.out.println("Sum of two numbers: "+z);
		
		z=z+30;
		System.out.println("After adding value 30 into it: " + z);

	}

}
