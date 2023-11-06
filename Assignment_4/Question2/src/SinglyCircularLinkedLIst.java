
public class SinglyCircularLinkedLIst {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {

			this.data = value;
			this.next = null;
		}
	}

	private Node tail;
	
	public SinglyCircularLinkedLIst() {
		tail=null;
	}
	
	public boolean isEmpty() {
	return tail==null;
		
	}
	
	public  void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail=newnode;
			newnode.next=newnode;
		}
		else {
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		
	}
	
	public void display() {
		Node trav=tail;
		
		do {System.out.println(trav.data);
		trav=trav.next;
			
		}while(trav!=tail);
	}
	
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty()) {
			tail=newnode;
			newnode.next=newnode;
		}
		else {
		newnode.next=tail.next;
		tail.next=newnode;
		tail=newnode;
		}
	}
	
	public void delFirst() {
		if(isEmpty()) {
			System.out.println("emptyyyyy");
			
		}
		else {
			tail.next=tail.next.next;
			
		}
		
	}
	
	public void delLast() {
		
		Node trav=tail;
		while(trav.next!=tail) {
			trav=trav.next;
			
		}
		trav.next=tail.next;
		tail=trav;
	}
	
	public void addPos(int pos,int value) {
		Node newnode = new Node(value);
		Node trav = tail.next;
		
	for(int i=1;i<pos-1;i++) {
		trav = trav.next;
	}
	newnode.next=trav.next;
	trav.next=newnode;
		
		
	}
	public void delpos(int pos) {
		Node trav=tail.next;
		for(int i=0;i<pos-1;i++) {
			trav=trav.next;
		}
		trav.next=trav.next.next;
		
	}
	
}

