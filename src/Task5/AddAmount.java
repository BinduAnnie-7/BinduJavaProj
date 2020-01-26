package Task5;

/*
 Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it. 
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. 
 Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Saving Box
2 - having a parameter which is the amount that will be added to Saving Box
Create object of the 'AddAmount' class and display the final amount in Saving Box. Also, create
 a method that can display how many transactions are done on the Saving Box.
*/
public class AddAmount {

	int amount, cnt = 0;

	public AddAmount() {
		// TODO Auto-generated constructor stub
		amount = 50;
		cnt++;
	}

	public AddAmount(int a) {
		amount += amount;
		cnt++;
	}

	public void printTransaction() {
		System.out.println("Sving Box" + amount);
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount a1 = new AddAmount();
		System.out.println();

	}

}
