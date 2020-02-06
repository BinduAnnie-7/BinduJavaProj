package TaskFour;

 /*PROGRAM 7: Write a JAVA program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces:
	 For eg,  => “({{)}[}]()” //output => true //can’t use stack
		//valid parenthesis
		{{(  [ ) ] }} => “[})(” //output => false
*/
public class BalancedBraces7 {

	static class stack {
		int top = -1;
		char item[] = new char[100];

		void push(char x) {
			if (top == 99) {
				System.out.println("Stack is full");
			} else {
				item[++top] = x;
			}
		}

		char pop() {
			if (top == -1) {
				System.out.println("Underflow error");
				return '\0';
			} else {
				char elemnt = item[top];
				top--;
				return elemnt;
			}
		}

		boolean isEmpty() {
			return (top == -1) ? true : false;
		}
	}

	static boolean isBracesPaired(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')')
			return true;
		else if (ch1 == '{' && ch2 == '}')
			return true;
		else if (ch1 == '[' && ch2 == ']')
			return true;
		else
			return false;
	}

	static boolean isBalancedBraces(char expression[]) {

		stack st = new stack();

		for (int i = 0; i < expression.length; i++) {

			if (expression[i] == '{' || expression[i] == '(' || expression[i] == '[')
				st.push(expression[i]);

			if (expression[i] == '}' || expression[i] == ')' || expression[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}

				else if (!isBracesPaired(st.pop(), expression[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		char expression[] = { '{', '(', ')', '}', '[', ']' };
		if (isBalancedBraces(expression))
			System.out.println("Balanced Braces");
		else
			System.out.println("Unbalanced Braces");
	}

}
