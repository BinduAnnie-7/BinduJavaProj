package Task6;

/*PROGRAM 3:Write a function that takes in a string of one or more words, and returns the same string, but with all
five or more letter words reversed. Strings passed in will consist of only letters and spaces. Spaces will be included
only when more than one word is present.
Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test")
=> returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"*/

public class SpinWrdProg3 {

	public String repeatedWords(String s) {
		String words[] = s.split(" ");
		int i, j;
		String str = "";
		for (i = 0; i < words.length; i++) {
			String reverseword = "";
			String word = words[i];

			if (word.length() >= 5) {

				for (j = word.length() - 1; j >= 0; j--)
					reverseword = reverseword + word.charAt(j);
			} else {
				for (j = 0; j < word.length(); j++)
					reverseword = reverseword + word.charAt(j);
			}

			str = str + reverseword + " ";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpinWrdProg3 s1 = new SpinWrdProg3();
		System.out.println(s1.repeatedWords("Hey fellow warriors"));

	}

}
