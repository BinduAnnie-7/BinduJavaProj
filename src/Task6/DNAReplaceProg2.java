package Task6;

/*PROGRAM 2: Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
for the development and functioning of living organisms.
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". 
DnaStrand.makeComplement("ATTGC") // return "TAACG" (in the result the A is replaced by T, also, C is replaced by G and vice versa.)
DnaStrand.makeComplement("GTAT") // return "CATA"
*/

public class DNAReplaceProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "AATGC";
		int len = s1.length();
		char ch[] = s1.toCharArray();
		char ch1[] = new char[s1.length()];
		int i;
		System.out.print("String " + s1 + " is replaced with ");
		for (i = 0; i < len; i++) {
			if (ch[i] == 'A') {
				ch[i] = 'T';
			} else if (ch[i] == 'T') {
				ch[i] = 'A';
			} else if (ch[i] == 'C') {
				ch[i] = 'G';
			} else if (ch[i] == 'G') {
				ch[i] = 'C';
			}
			System.out.print(ch[i]);
		}
	}

}
