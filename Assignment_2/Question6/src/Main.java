import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DescendingStack q = new DescendingStack(3);
		
		int choice = -1;

		do {

			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("enter choice ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (q.isfull()) {
					System.out.println("QEUE IS FULL...");
					break;
				}
				System.out.println("ENTER DATA TO ENTER...");
				int data = sc.nextInt();
				q.push(data);

				break;
			case 2:if(q.isEmpty()) {
				System.out.println("queue is empty...");
				break;
			}
			q.pop();
			
				break;
			case 3:q.peek();
				break;
			}

		} while (choice != 0);

	}
		

	}


