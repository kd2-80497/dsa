
public class ReverseListMain {

	public static void main(String[] args) {
		List l1 = new List();
		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(4);
		l1.addNode(5);
		l1.addNode(6);
		l1.addNode(7);
		l1.addNode(8);
		
		System.out.println("Original List :");
		l1.display();
		
		l1.reverseList();
		System.out.println("Reversed List :");
		l1.display();
		
		

	}

}
