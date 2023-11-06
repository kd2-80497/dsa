
public class Main {

	public static void main(String[] args) {
	
		SinglyCircularLinkedLIst list = new SinglyCircularLinkedLIst();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(100);
		list.delFirst();
		list.delLast();
		list.addPos(3, 500);
		list.delpos(2);
		list.display();

	}

}
