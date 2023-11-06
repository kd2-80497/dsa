
public class ConversionMain {

	public static int prio(char op) {
		switch (op) {
		case '$':
			return 10;
		case '%':
			return 9;
		case '/':
			return 9;
		case '*':
			return 9;
		case '+':
			return 8;
		case '-':
			return 8;
		}
		return 0;
	}

	public static StringBuilder infixtoPostfix(String infix) {

		Stack st = new Stack(10);
		
		StringBuilder postfix = new StringBuilder();
String[] token = infix.split("\\s+");
		for (String tok : token) {


			if (Character.isDigit(tok)) {
				postfix.append(tok).append(" ");
			} else if (tok.equals("(")) {
				st.push(tok);
			} else if (tok.equals(")")) {
				while (st.peek() == '(') {
					postfix.append(st.pop());
				}
				st.pop();

			}

			else {
				while (!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
					postfix.append(st.pop());
				}
				st.push(ele);
			}

		}
		while (!st.isEmpty()) {
			postfix.append(st.pop());
		}

		return postfix;
	}

	// INFIX TO PREFIX
	public static StringBuilder infixToPrefix(String infix) {

		Stack st = new Stack(10);
		StringBuilder prefix = new StringBuilder();

		for (int i = infix.length()-1; i > 0; i--) {

			char ele = infix.charAt(i);

			if (Character.isDigit(ele)) {
				prefix.append(ele);
			} else if (ele == ')') {
				st.push(ele);
			}
			else if (ele == '(') {
				while (st.peek() != ')') {
					prefix.append(st.pop());
				}
				st.pop();

			}

			else {
				while (!st.isEmpty() && prio(st.peek()) > prio(ele)) {

					prefix.append(st.pop());

				}
				st.push(ele);
			}

		}
		while (!st.isEmpty()) {
			prefix.append(st.pop());
		}
		StringBuilder revprefix = prefix.reverse();

		return revprefix;

	}

	public static void main(String[] args) {

		String infix = "1 $ 9 + 3 * 4 - ( 6 + 8 / 2 ) + 7";

		System.out.println("infix = " + infix);
		StringBuilder postfix = infixtoPostfix(infix);
		System.out.println("POSTFIX = " + postfix);

		StringBuilder prefix = infixToPrefix(infix);
		System.out.println("PREFIX = " + prefix);

	}

}
