
public class Main {

	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addFirst(50);
		list.addFirst(40);
        
		list.addFirst(30);
        
		list.addFirst(20);
        
		list.addFirst(10);
//		list.addLast(100);
//		list.delFirst();
//		list.delLast();
//		list.addPos(500,3);
//		list.delPos(3);
		list.delPos(6);
		list.display();
        
        
	}

}
