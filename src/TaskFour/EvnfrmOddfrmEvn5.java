package TaskFour;

public class EvnfrmOddfrmEvn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no[] = { 3, 7, 5, 4, 9 }, i, evencnt = 0, oddcnt = 0, valeven = 0, valodd = 0;

		for (i = 0; i < no.length; i++) {
			if (no[i] % 2 == 0) {

				evencnt++;
				valeven = no[i];

			} else if (no[i] % 2 != 0) {

				oddcnt++;
				valodd = no[i];
			}

		}
		if (evencnt == 1) {
			System.out.println("Even value::: " + valeven);
		}
		if (oddcnt == 1) {
			System.out.println("Odd value::: " + valodd);
		}

	}

}
