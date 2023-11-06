
public class ExpressionEvaluationMain {

	public static int calculate(int op1, int op2, char opr) {

		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;

	}

	public static int PostfixEvaluation(String postfix) {

		Stack st = new Stack(10);
		for (int i = 0; i < postfix.length(); i++) {

			char ele = postfix.charAt(i);
			if (Character.isDigit(ele)) {
				st.push(ele - '0');

			} else {

				int op2 = st.pop();
				int op1 = st.pop();

				int res = calculate(op1, op2, ele);
				st.push(res);
			}

		}
		while (!st.isEmpty()) {
			return st.pop();
		}

		return 0;
	}

	public static int prefixEvaluation(String infix) {

		Stack st = new Stack(10);
		for (int i = infix.length()-1; i > 0; i--) {
			char ele = infix.charAt(i);

			if (Character.isDigit(ele)) {
				st.push(ele - '0');
			} else {
				int op1 = st.pop();
				int op2 = st.pop();
				int res = calculate(op1, op2, ele);
				st.push(res);
			}

		}
		while (!st.isEmpty()) {
			return st.pop();
		}

		return 0;

	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";

		System.out.println("Postfix : " + postfix);
		int result = PostfixEvaluation(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";

		System.out.println("Prefix : " + prefix);
		result = prefixEvaluation(prefix);
		System.out.println("Result : " + result);

	}

}
