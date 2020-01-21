package TaskFour;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 40, 10, 50, 60, 20 };
		int sum = 0, i;
		int minval = num[0];
		int maxval = num[0];
		for (i = 0; i < num.length; i++) {

			if (num[i] < minval) {
				minval = num[i];

			} else if (num[i] > maxval) {
				maxval = num[i];
			}
			sum = sum + num[i];

		}
		sum = sum - (maxval + minval);
		System.out.println("Minval::: " + minval + " Max val:::: " + maxval);
		System.out.println("sum is:" + sum);

	}

}
