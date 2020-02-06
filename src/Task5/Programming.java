package Task5;

/*
 *PROGRAM 6: Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, 
 *then the message "I love programming languages" should be printed. If some String is passed to it, then
 * in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed. 
There can be more than one programming languages.

 */
public class Programming {

	public Programming() {
		// TODO Auto-generated constructor stub
		System.out.println("I love programming languages");
	}

	public Programming(String str) {
		System.out.println("I love " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");
	}

}
