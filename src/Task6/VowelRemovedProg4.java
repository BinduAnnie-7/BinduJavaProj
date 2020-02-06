package Task6;

/*PROGRAM 4:Your task is to write a function that takes a string and return a new string with all vowels removed.
		For example, the string "This website is for All!" would become "Ths wbst s fr LL!".*/

public class VowelRemovedProg4 {

	public String getConsonant(String s) {

		int i;
		String str = "";
		for (i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I')
					|| (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U'))) {
				str += ch;
			}

		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VowelRemovedProg4 vrp = new VowelRemovedProg4();
		System.out.print(vrp.getConsonant("This website is for All"));

	}

}
