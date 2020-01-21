package TaskFour;

public class RemoveWhiteSpce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char st[] = "Hello Hi! How are you?".toCharArray();
		int i;
		for (i = 0; i < st.length; i++) {
			if (st[i] != ' ') {
				System.out.print(st[i]);
			}
		}
	}

}
