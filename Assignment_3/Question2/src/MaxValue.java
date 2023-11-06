import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
		int choice=-1;
		Stack st = new Stack(5);
		do {
		System.out.println("1.PUSH");
		System.out.println("2.POP");
		System.out.println("3.PEEK");
		System.out.println("4.DISPALY");
		System.out.println("5.GET MAX VALUE");
		System.out.println("ENTER CHOICE ");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:if(st.isFull()) {
			
			System.out.println("STACK IS FULL..");
		}
		else {
			System.out.println("enter data to push ");
			int data=sc.nextInt();
			st.push(data);
			
		}
			break;
		case 2:
			if(st.isEmpty()) {
				System.out.println("STSCK IS EMPTY..");
			}
			else {
				System.out.println("POP ELEMENT = "+st.pop());
			}
			break;
		case 3:System.out.println("PEEK ELEMENT = "+st.peek());
			break;
		case 4:st.display();
			break;
		case 5:System.out.println("MAXIMUN ELEMENT = "+st.maxValue());
			break;
			
		}
		
		}while(choice!=0);
		
		
//		st.push(10);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		st.push(50);
//	
//		st.display();
//		System.out.println(st.peek());
//		System.out.println("MAX = "+st.maxValue());

}
}