package TaskFour;

public class RepeatReverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "June Month";
		int i, j, cnt = 0;
		String words[] = str.split(" ");
		String revStr = "";
		char ch[] = str.toCharArray();

		for (i = 0; i < ch.length; i++) {
			for (j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i != j) {
					cnt = 1;
				}
			}
		}
		if (cnt == 1)
			System.out.println(true);
		else
			System.out.println(false);

		for (i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);

			}
			revStr = revStr + reverseWord + " ";
		}

		System.out.println(revStr);

	}

}
