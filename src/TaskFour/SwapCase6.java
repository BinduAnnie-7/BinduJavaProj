package TaskFour;

public class SwapCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "heLLO WoRld";

		int i;
		for (i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch > 64 && ch < 91) {
				ch = ch + 32;
				System.out.print((char) ch);
			} else if (ch > 96 && ch < 123) {
				ch = ch - 32;
				System.out.print((char) ch);
			}
			if (ch == 32)
				System.out.print(" ");

		}

	}

}
