package Task6;

public class RepeatAlphaNumeric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX_VAL = 256;
		String s = "aCbccc11";
		int len = s.length();
		int count[] = new int[MAX_VAL];
		char ch[] = new char[s.length()];
		int i, j;
		for (i = 0; i < len; i++) {
			count[s.charAt(i)]++;
		}
		for (i = 0; i < len; i++) {
			ch[i] = s.charAt(i);
			int cnt = 0;
			for (j = 0; j <= i; j++) {
				if (ch[i] == ch[j]) {
					cnt++;

				}

			}

			if (count[s.charAt(i)] > 1) {
				if (cnt == 1) {
					System.out.println(ch[i] + " is repeated: " + count[s.charAt(i)] + " times");
				}
			} else {
				System.out.println(ch[i] + " is repeated: " + 0 + " times");
			}

		}
	}

}
