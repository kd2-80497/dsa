


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
		
	}
		
	
	public void findMax() {
		int max = 0;
		Node trav=head;
		
		if(isEmpty()) {
			System.out.println("link is empty...");
		}
		
		else {
			
			while(trav!=null) {
				if(trav.data>max)
					max=trav.data;
				trav=trav.next;
			}
//			System.out.println("hiiii");
		}
//		System.out.println("hiiii");
		System.out.println("MAX = "+max);
	}

	public void findMin() {
		int min=50;
		Node trav=head;
		
		if(isEmpty()) {
			System.out.println("link is empty...");
		}
		
		else {
			
			while(trav!=null) {
				if(trav.data<min)
					min=trav.data;
				trav=trav.next;
			}
//			System.out.println("hiiii");
		}
//		System.out.println("hiiii");
		System.out.println("MIN = "+min);
	}

		
	}


