import java.util.Stack;

public class List {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;

	public List() {
		head = null;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {

		Node newnode = new Node(value);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnode into head
			head = newnode;
		}
	}

	public void addLast(int value) {

		Node newnode = new Node(value);

		if (isEmpty())

			head = newnode;

		else {

			Node trav = head;
			while (trav.next != null)
				trav = trav.next;

			trav.next = newnode;

		}

//		System.out.println(value+ "incorreect value insert new value");
	}

	public void deleteFirst() {
		// 1. if list is empty
		if (isEmpty())
			// print msg
			System.out.println("List is empty");
		// 2. if list is not empty
		else
			// a. move head on second node
			head = head.next;
	}

	public void displayList() {

		Node trav = head;
		System.out.print("List :");
		while (trav != null) {

			System.out.print("  " + trav.data);

			trav = trav.next;
		}
		System.out.println("");
	}

	public void deleteAll() {
		head = null;
	}

	public void addSorted(int value) {
		Node newnode = new Node(value);
		Node trav = head;
		if(head==null)
			head=newnode;
		
//		while (trav.next!=null ) {
//			System.out.println("hiii");
//			
//			if(trav.data <= value && trav.next.data >value) {
//				newnode.next = trav.next;
//				trav.next = newnode;
//			}
//			trav = trav.next;
//	
//		}
//		if(trav.next==null) {
//			addLast(value);
//		}
		

		
	}

}
