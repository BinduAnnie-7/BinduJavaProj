package TaskTwo;

import java.util.Scanner;

public class Num0to6Prog5 {

	public static void main(String[] args) {

		 int num;
		 for(num=0;num<=6;num++)
		 {
			 if(num==3 || num==6)
			 {
				 continue;
			 }
			 System.out.println(num);
		 }
	}
}
