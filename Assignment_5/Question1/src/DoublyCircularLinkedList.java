
public class DoublyCircularLinkedList {

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

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (isEmpty())
			return;

		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println(" ");
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		} else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			
			head = newnode;
		}

	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head=newnode;
			head.next = newnode;
			head.prev = newnode;
			
		}
		else {
			newnode.prev=head.prev;
			newnode.next=head;
			head.prev.next=newnode;
			head.prev=newnode;
		}
		
		
		
	}
	
	public void delFirst() {
		if(isEmpty())
			System.out.println("LIST IS EMPTY..");
	
		else {
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.next;
			
		}
	}
	
	public void delLast() {
		if(isEmpty())
			System.out.println("LIST IS EMPTY..");
	
		else {
			head.prev.prev.next=head;
			head.prev=head.prev.prev;
		}
	}
	public void addPos(int value,int pos) {
		Node newnode = new Node(value);
		
		if(pos<=1)
			addFirst(value);
		else if(isEmpty()) {
			head=newnode;
		head.next = newnode;
		head.prev = newnode;
		}
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			newnode.prev=trav;
			newnode.next=trav.next;
			trav.next=newnode;
		}
		
	}
	
	public  void delPos(int pos) {
		
		if(pos<=1)
		delFirst();
	else if(isEmpty())
		System.out.println("list os empty...");
	else {
		Node trav=head;
		for(int i=1;i<pos &&trav.next != head;i++) {
			trav=trav.next;
		}
		trav.prev.next=trav.next;
		trav.next.prev=trav.prev;
	}
	
	}
	
	

}
