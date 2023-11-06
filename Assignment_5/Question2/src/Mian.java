import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
Stack st= new Stack();
		int choice = -1;
		do {
			System.out.println("1.push");

			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("ENTER CHOICE ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {

			case 1:System.out.println("ENTER DATA TO ENTER = ");
			int value = sc.nextInt();
				st.push(value);
				
				break;
			case 2:st.pop();
				break;
			case 3:
				st.peek();
			}

		} while (choice != 0);

	}

}
