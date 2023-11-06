
public class List {

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;

		}

	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;

		}

	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void delFirst() {
		head = head.next;

	}

	public void delLast() {
		Node trav = head;
		while (trav.next.next != null) {
			trav = trav.next;

		}
		trav.next = null;

	}

}
