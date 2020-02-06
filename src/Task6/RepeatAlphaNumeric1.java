package Task6;

/*PROGRAM 1:Write a function that will return the count of distinct case-insensitive alphabetic characters and 
		numeric digits that occur more than once in the input string. The input string can be assumed to contain 
		only alphabets (both uppercase and lowercase) and numeric digits.
		Example
		"abcde" -> 0  # no characters repeats more than once
		"aabbcde" -> 2  # 'a' and 'b'
		"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
		"indivisibility" -> 1 # 'i' occurs six times
		"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
		"aA11" -> 2 # 'a' and '1'
		"ABBA" -> 2 # 'A' and 'B' each occur twice*/

public class RepeatAlphaNumeric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX_VAL = 256;
		String s = "aCbc2cc11";
		s = s.toLowerCase();
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
				System.out.println(ch[i] + " is repeated: " + 0 + " no repeatation");
			}

		}
	}

}
